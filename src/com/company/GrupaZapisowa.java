package com.company;
import java.util.List;

public class GrupaZapisowa {

	private int idGrupyZapisowej;
	private String nazwaGrupy;
	private List<Integer> listaIDKursow;

	public int getIdGrupyZapisowej() {
		return idGrupyZapisowej;
	}

	public void setIdGrupyZapisowej(int idGrupyZapisowej) {
		this.idGrupyZapisowej = idGrupyZapisowej;
	}

	public String getNazwaGrupy() {
		return nazwaGrupy;
	}

	public void setNazwaGrupy(String nazwaGrupy) {
		this.nazwaGrupy = nazwaGrupy;
	}

	public List<Integer> getListaIDKursow() {
		return listaIDKursow;
	}

	public void setListaIDKursow(List<Integer> listaIDKursow) {
		this.listaIDKursow = listaIDKursow;
	}
}