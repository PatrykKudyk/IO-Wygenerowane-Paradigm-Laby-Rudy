package com.company;

import java.util.ArrayList;
import java.util.List;

public class ZarzadcaUzytkownikow {

	private List<List<PrawoDoZapisu>> ListaListPrawDoZapisow;

	public List<GrupaZapisowa> SprawdzGrupyPrzypisane() {
		List<GrupaZapisowa> lista = new ArrayList<GrupaZapisowa>();

		return lista;
	}

	public List<PrawoDoZapisu> SprawdzPrawaDoZapisow(int IDStudenta) {
		List<PrawoDoZapisu> lista = new ArrayList<PrawoDoZapisu>();

		return lista;
	}

	public List<List<PrawoDoZapisu>> getListaListPrawDoZapisow() {
		return ListaListPrawDoZapisow;
	}

	public void setListaListPrawDoZapisow(List<List<PrawoDoZapisu>> listaListPrawDoZapisow) {
		ListaListPrawDoZapisow = listaListPrawDoZapisow;
	}
}