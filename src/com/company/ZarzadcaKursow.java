package com.company;

import java.util.ArrayList;
import java.util.List;

public class ZarzadcaKursow {

	private List<List<GrupaZapisowa>> ListaListGrupZapisowych;

	public List<GrupaZapisowa> PobierzListeGrupZapisowych() {
		List<GrupaZapisowa> lista = new ArrayList<GrupaZapisowa>();

		return lista;
	}

	public List<Kurs> PobierzKursyZGrupy() {
		List<Kurs> lista = new ArrayList<Kurs>();

		return lista;
	}

	public boolean SprawdzDostepnoscMiejsc(int Kurs) {

		return false;
	}

	public boolean SprawdzCzyZapisanyJuzNaTenKurs(int Kurs) {

		return false;
	}

	public void DodajDoRezerwy(int Kurs, int IDStudenta) {
	}

	public boolean DodajDoKursu(int Kurs, int IDStudenta) {

		return false;
	}

	public List<Kurs> PobierzListeKursow(int Integer) {
		List<Kurs> lista = new ArrayList<Kurs>();

		return lista;
	}

	public int PobierzPierwszegoStudentaZRezerwy() {
		int liczba = 0;

		return liczba;
	}

}