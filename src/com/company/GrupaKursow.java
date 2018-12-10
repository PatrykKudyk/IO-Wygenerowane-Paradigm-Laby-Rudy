package com.company;
import java.util.ArrayList;

public class GrupaKursow {

	private int idGrupyKursow;
	private int potok;
	private ArrayList<Boolean> maskaKursow;
	private String nazwaKursu;

	public int getIdGrupyKursow() {
		return idGrupyKursow;
	}

	public void setIdGrupyKursow(int idGrupyKursow) {
		this.idGrupyKursow = idGrupyKursow;
	}

	public int getPotok() {
		return potok;
	}

	public void setPotok(int potok) {
		this.potok = potok;
	}

	public ArrayList<Boolean> getMaskaKursow() {
		return maskaKursow;
	}

	public void setMaskaKursow(ArrayList<Boolean> maskaKursow) {
		this.maskaKursow = maskaKursow;
	}

	public String getNazwaKursu() {
		return nazwaKursu;
	}

	public void setNazwaKursu(String nazwaKursu) {
		this.nazwaKursu = nazwaKursu;
	}
}