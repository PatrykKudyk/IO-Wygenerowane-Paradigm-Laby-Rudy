package com.company;

import java.util.List;

public class GUI {

    public void WyswietlGlowneMenu(Uprawnienia uprawnienia) {
        System.out.println("\t\tMenu Głowne Programu");
        System.out.println("\nCo chcialbys teraz zrobic?");
        if (uprawnienia == Uprawnienia.Student) {
            System.out.println("[1] - Zapisz na kursy");
            System.out.println("[2] - Wyswietlic Liste Grup Zapisowych");
            System.out.println("[3] - Wyswietlic Oceny");
            System.out.println("[4] - Wyswietlic Plan");
            System.out.println("[0] - Wyloguj sie");
        } else if (uprawnienia == Uprawnienia.Prowadzacy) {
            System.out.println("[1] - Wyswietlic Liste Studentów");
            System.out.println("[2] - Wyswietlic Plan");
            System.out.println("[0] - Wyloguj sie");
        } else if (uprawnienia == Uprawnienia.Planista) {
            System.out.println("[1] - Zmodyfikowac Bazę Kursow");
            System.out.println("[2] - Utworzyc Kurs");
            System.out.println("[0] - Wyloguj sie");
        }
    }

    public void WyswietlListeKursow(List<Kurs> lista) {
        System.out.println("Ponizej znajduje sie lista kursow:");
        for (int i = 0; i < lista.size(); i++)
            System.out.println(i + ") " + lista.get(i).toString());
    }

    public void WyswietlListeGrupZapisowych(List<GrupaZapisowa> lista) {
        System.out.println("Ponizej znajduje się lista grup zapisowych:");
        for (int i = 0; i < lista.size(); i++)
            System.out.println(i + " Nazwa - " + lista.get(i).getNazwaGrupy());
    }

    public void WyswietlKomunikat(String komunikat) {
        System.out.println(komunikat);
    }

    public void WyswietlMenuLogowania() {
        System.out.println("Podaj dane logowania");
        System.out.println("Login: ");
    }

    public void WyswietlListeStudentow(List<Student> lista) {
        System.out.println("Lista studentow: ");
        for (int i = 0; i < lista.size(); i++)
            System.out.println(i + ") - " + lista.get(i).getImie() + lista.get(i).getNazwisko());
    }

    public void WyswietlOceny() {
    }

    public void WyswietlPlan(List<Kurs> lista) {
        if (lista.size() == 0) {
            System.out.println("Twoj plan jest pusty.");
            return;
        }
        System.out.println("Twoj plan jest nastepujacy:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ") " + lista.get(i).toString());
        }
    }

}