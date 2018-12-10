package com.company;

import java.util.ArrayList;
import java.util.List;

public class ZarzadcaKursow {

	private List<List<GrupaZapisowa>> ListaListGrupZapisowych;

	public List<GrupaZapisowa> PobierzListeGrupZapisowych(int IDStudenta) {
		List<GrupaZapisowa> lista = new ArrayList<GrupaZapisowa>();
		List<Integer> listaKursow = new ArrayList<Integer>();
		listaKursow.add(1);
		listaKursow.add(2);
		listaKursow.add(3);
		listaKursow.add(4);
		listaKursow.add(5);

		GrupaZapisowa g1 = new GrupaZapisowa(1,"ZapisyZimowe", listaKursow);
		lista.add(g1);

		return lista;
	}

	public List<Kurs> PobierzKursyZGrupy(GrupaZapisowa grupa) {
		List<Kurs> lista = new ArrayList<Kurs>();
		//tutaj zarzadca pobiera z bazy danych liste kursow z podanej grupy

		Kurs k1 = new Kurs(1,"Analiza 1.1", 1, 201,"C-1",new GodzinaZajec(13,15),90,DzienTygodnia.Poniedzialek,
				ParzystoscTygodnia.Parzysty,TypKursu.Wyklad,1,6, 2);
		Kurs k2	= new Kurs(2,"Analiza 1.1", 1, 19,"C-3",new GodzinaZajec(11,15),90,DzienTygodnia.Poniedzialek,
				ParzystoscTygodnia.Parzysty,TypKursu.Cwiczenia,1,2,3);
		Kurs k3 = new Kurs(3,"Podstawy Programowania", 2, 203,"C-1",new GodzinaZajec(9,15),90,DzienTygodnia.Wtorek,
				ParzystoscTygodnia.Nieparzysty,TypKursu.Wyklad,2,4,0);
		Kurs k4 = new Kurs(4,"Algebra 1", 3, 23,"C-3",new GodzinaZajec(15,15),90,DzienTygodnia.Wtorek,
				ParzystoscTygodnia.Parzysty,TypKursu.Cwiczenia,1,2,10);
		Kurs k5 = new Kurs(5,"Miernictwo", 4, 201,"C-1",new GodzinaZajec(11,15),90,DzienTygodnia.Poniedzialek,
				ParzystoscTygodnia.Parzysty,TypKursu.Wyklad,1,2,0);
		lista.add(k1);
		lista.add(k2);
		lista.add(k3);
		lista.add(k4);
		lista.add(k5);
		return lista;
	}

	public boolean SprawdzDostepnoscMiejsc(Kurs kurs) {
		if(kurs.getWolneMiejsca()>0)
			return true;
		return false;
	}

	public boolean SprawdzCzyZapisanyJuzNaTenKurs(Kurs kurs, int idStudenta) {
		for(int i = 0; i < kurs.getListaStudentow().size(); ++i)
			if(kurs.getListaStudentow().get(i).equals(idStudenta))
				return true;
		return false;
	}

	public void DodajDoKursu(Kurs kurs, int iDStudenta) {
		kurs.dodajDoListyStudentow(iDStudenta);
	}

	public void DodajDoRezerwy(Kurs kurs, int iDStudenta) {

		kurs.dodajDoListyStudentowRezerwowych(iDStudenta);
	}

	public List<Kurs> PobierzListeKursow(int Integer) {
		List<Kurs> lista = new ArrayList<Kurs>();

		return lista;
	}

	public int PobierzPierwszegoStudentaZRezerwy() {
		int liczba = 0;

		return liczba;
	}

	public List<List<GrupaZapisowa>> getListaListGrupZapisowych() {
		return ListaListGrupZapisowych;
	}

	public void setListaListGrupZapisowych(List<List<GrupaZapisowa>> listaListGrupZapisowych) {
		ListaListGrupZapisowych = listaListGrupZapisowych;
	}
}