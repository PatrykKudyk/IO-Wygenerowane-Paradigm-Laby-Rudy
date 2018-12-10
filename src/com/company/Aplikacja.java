package com.company;

import java.util.*;

public class Aplikacja {

    private List<List<GrupaZapisowa>> ListaListGrupZapisowych;
    private GUI gui;
    private Student student;

    public Aplikacja() {
        this.gui = new GUI();
        this.student = new Student(new ArrayList<Integer>(), 1, TypStudiow.Inzynierskie, 1);
    }

    public void StartProgramu() {
        gui.WyswietlMenuLogowania();
        String nazwa, haslo;
        Scanner input = new Scanner(System.in);
        nazwa = input.nextLine();
        System.out.print("Wprowadz haslo dla " + nazwa + ": ");
        haslo = input.nextLine();
        if (nazwa.equals("a") && haslo.equals("a")) {
            gui.WyswietlGlowneMenu(Uprawnienia.Student);
            int wybor = input.nextInt();
            //  while (!input.hasNextInt())
            //      input.next();
            System.out.println(wybor);
            switch (wybor) {
                case 1:
                    ZapisyNaKurs();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } else if (nazwa.equals("b") && haslo.equals("b")) {
            gui.WyswietlGlowneMenu(Uprawnienia.Prowadzacy);
            int wybor = input.nextInt();
            switch (wybor) {
                case 1:
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        } else if (nazwa.equals("c") && haslo.equals("c")) {
            gui.WyswietlGlowneMenu(Uprawnienia.Planista);
            int wybor = input.nextInt();
            switch (wybor) {
                case 1:
                    ModyfikacjaBazyKursow();
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        } else
            gui.WyswietlKomunikat("Kombinacja nieprawidłowa!");
    }

    private void ZapisyNaKurs() {
        List<GrupaZapisowa> grupaZapisowa = ZwrocGrupy(student.getIdUzytkownika());
        if (!SprawdzCzyPuste(grupaZapisowa)) {
            gui.WyswietlListeGrupZapisowych(grupaZapisowa);
            System.out.println("\nWybierz grupę zapisową: ");
            Scanner input = new Scanner(System.in);
            int wybor = input.nextInt();
            if (wybor >= 0 && wybor < grupaZapisowa.size())
                WyborKursow(grupaZapisowa.get(wybor));
        }
    }

    private void WyborKursow(GrupaZapisowa grupa) {
        ZarzadcaKursow zarzadcaKursow = new ZarzadcaKursow();
        List<Kurs> listaKursow = zarzadcaKursow.PobierzKursyZGrupy(grupa);
        gui.WyswietlListeKursow(listaKursow);
        System.out.println("\nWybierz kurs, na który chcesz się zapisać: ");
        Scanner input = new Scanner(System.in);
        int wybor = 0;
        while (wybor != 10) {
            wybor = input.nextInt();
            if (wybor >= 0 && wybor < listaKursow.size())
                ZapiszNaKurs(listaKursow.get(wybor));
        }
        gui.WyswietlKomunikat("Brawo! Zapisałeś się na wszystkie kursy!");
    }

    private void ZapiszNaKurs(Kurs kurs) {
        //No i tutaj magicznie w bazie danych jest to uaktualniane oraz następuje
        //sprawdzenie, czy na dany kurs znajdują się wolne miejsca

        ZarzadcaKursow zarzadcaKursow = new ZarzadcaKursow();
        if (!zarzadcaKursow.SprawdzCzyZapisanyJuzNaTenKurs(kurs, student.getIdUzytkownika())) {
            if (zarzadcaKursow.SprawdzDostepnoscMiejsc(kurs)) {
                zarzadcaKursow.DodajDoKursu(kurs, student.getIdUzytkownika());
                gui.WyswietlKomunikat("Pomyślnie zapisano na kurs!");
            } else {
                zarzadcaKursow.DodajDoRezerwy(kurs, student.getIdUzytkownika());
                gui.WyswietlKomunikat("Dodany do rezerwy.");
            }
        } else
            gui.WyswietlKomunikat("Jesteś już zapisany na ten kurs!");

    }

    private List<GrupaZapisowa> ZwrocGrupy(int idStudenta) {
        ZarzadcaUzytkownikow zarzadcaUzytkownikow = new ZarzadcaUzytkownikow();
        ZarzadcaKursow zarzadcaKursow = new ZarzadcaKursow();
        List<GrupaZapisowa> listGrupZapUzytkownika = zarzadcaUzytkownikow.SprawdzGrupyPrzypisane(idStudenta);
        List<PrawoDoZapisu> prawoDoZapisuList = zarzadcaUzytkownikow.SprawdzPrawaDoZapisow(idStudenta);
        List<GrupaZapisowa> grupyDoKtorychMaPrawo = new ArrayList<>();
        for (GrupaZapisowa grupa : listGrupZapUzytkownika) {
            for (PrawoDoZapisu prawo : prawoDoZapisuList) {
                if (grupa.getIdGrupyZapisowej() == prawo.getIdGrupZapisowych()) {
                    grupyDoKtorychMaPrawo.add(grupa);
                }
            }
        }
        return grupyDoKtorychMaPrawo;
    }

    private void ModyfikacjaBazyKursow() {
        List<GrupaZapisowa> grupaZapisowa = ZwrocGrupy(student.getIdUzytkownika());
        ZarzadcaKursow zarzadcaKursow = new ZarzadcaKursow();
        List<Kurs> lista = zarzadcaKursow.PobierzKursyZGrupy(grupaZapisowa.get(0));
        gui.WyswietlListeKursow(lista);
        System.out.println("Który kurs chciałbyś zmodyfikować?");
        Scanner input = new Scanner(System.in);
        int wybor = input.nextInt();
        Kurs temp = new Kurs();
        temp = ModyfikacjaKursu(lista.get(wybor));
        lista.remove(wybor);
        lista.add(wybor,temp);
    }

    private Kurs ModyfikacjaKursu(Kurs kurs) {
        Scanner input = new Scanner(System.in);
        int wybor = -1;
        while (wybor != -5) {
            gui.WyswietlKomunikat(kurs.toString());
            gui.WyswietlKomunikat("Ktory parametr chcesz zmodyfikowac?");
            wybor = input.nextInt();
            input.nextLine();
            switch (wybor) {
                case 1:
                    gui.WyswietlKomunikat("Podaj nazwe");
                    String nazwa = input.nextLine();
                    kurs.setNazwaKursu(nazwa);
                    break;
                case 2:
                    gui.WyswietlKomunikat("Podaj ID prowadzacego");
                    int idProwadzacego = input.nextInt();
                    kurs.setIdProwadzacego(idProwadzacego);
                    break;
                case 3:
                    gui.WyswietlKomunikat("Podaj sale");
                    int numerSali = input.nextInt();
                    kurs.setSala(numerSali);
                    break;
                case 4:
                    gui.WyswietlKomunikat("Podaj budynek");
                    String budynek = input.nextLine();
                    kurs.setBudynek(budynek);
                    break;
                case 5:
                    gui.WyswietlKomunikat("Podaj godzine zajec");
                    int godzina = input.nextInt();
                    gui.WyswietlKomunikat("Podaj minute zajec");
                    int minuta = input.nextInt();
                    GodzinaZajec godzinaZajec = new GodzinaZajec(godzina, minuta);
                    kurs.setGodzina(godzinaZajec);
                    break;
                case 6:
                    gui.WyswietlKomunikat("Podaj czas trwania w minutach");
                    int czasTrwania = input.nextInt();
                    kurs.setCzasTrwania(czasTrwania);
                    break;
                case 7:
                    gui.WyswietlKomunikat("Podaj dzien tygodnia");
                    int dzienTygodniaInt = input.nextInt();
                    DzienTygodnia dzienTygodnia = DzienTygodnia.GetDzienTygodnia(dzienTygodniaInt);
                    kurs.setDzien(dzienTygodnia);
                    break;
                case 8:
                    gui.WyswietlKomunikat("Podaj parzystosc");
                    int parzystoscTygodniaInt = input.nextInt();
                    ParzystoscTygodnia parzystoscTygodnia = ParzystoscTygodnia.GetParzystoscTygodnia(parzystoscTygodniaInt);
                    kurs.setParzystosc(parzystoscTygodnia);
                    break;
                case 9:
                    gui.WyswietlKomunikat("Podaj typ kursu");
                    int typKursuInt = input.nextInt();
                    TypKursu typKursu = TypKursu.GetTypKursu(typKursuInt);
                    kurs.setTyp(typKursu);
                    break;
                case 10:
                    gui.WyswietlKomunikat("Podaj ID grupy kursow");
                    int idGrupyKursow = input.nextInt();
                    kurs.setIdGrupyKursow(idGrupyKursow);
                    break;
                case 11:
                    gui.WyswietlKomunikat("Podaj ilosc ECTS");
                    int iloscECTS = input.nextInt();
                    kurs.setIloscECTS(iloscECTS);
                    break;
                case -5:
                    gui.WyswietlKomunikat("Owocna modyfikacja drogi Panie. Pozdrawiam!");
                    break;
                default:
                    gui.WyswietlKomunikat("Zly wybor, YOU DIED!");
                    break;
            }
        }
        return kurs;
    }

    public boolean SprawdzCzyPuste(List<GrupaZapisowa> lista) {
        if (lista.isEmpty())
            return true;
        return false;
    }

    public boolean SprawdzCzyZapisanyNaWszystko() {

        return false;
    }

    public Kurs WybierzKurs() {
        Kurs kurs = new Kurs();

        return kurs;
    }

    public List<GrupaZapisowa> PobierzListaGrupZapisowych() {
        List<GrupaZapisowa> lista = new ArrayList<GrupaZapisowa>();

        return lista;
    }

    public List<Kurs> PobierzListeKursow() {
        List<Kurs> lista = new ArrayList<Kurs>();

        return lista;
    }

    public Map<Kurs, Integer> PobierzListeOcen() {
        Map<Kurs, Integer> mapa = new HashMap<Kurs, Integer>();

        return mapa;
    }

    public List<List<GrupaZapisowa>> getListaListGrupZapisowych() {
        return ListaListGrupZapisowych;
    }

    public void setListaListGrupZapisowych(List<List<GrupaZapisowa>> listaListGrupZapisowych) {
        ListaListGrupZapisowych = listaListGrupZapisowych;
    }
}