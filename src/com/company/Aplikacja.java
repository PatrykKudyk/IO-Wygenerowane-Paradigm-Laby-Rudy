package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aplikacja {

	private List<List<GrupaZapisowa>> ListaListGrupZapisowych;

	public boolean SprawdzCzyPuste() {

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