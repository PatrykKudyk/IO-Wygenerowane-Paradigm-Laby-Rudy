package com.company;

public class Kurs {

	private int idKursu;
	private String nazwaKursu;
	private int idProwadzacego;
	private int sala;
	private String budynek;
	private GodzinaZajec godzina;
	private int czasTrwania;
	private DzienTygodnia dzien;
	private ParzystoscTygodnia przystosc;
	private TypKursu typ;
	private int idGrupyKursow;
	private int iloscECTS;

	public int getIdKursu() {
		return idKursu;
	}

	public void setIdKursu(int idKursu) {
		this.idKursu = idKursu;
	}

	public String getNazwaKursu() {
		return nazwaKursu;
	}

	public void setNazwaKursu(String nazwaKursu) {
		this.nazwaKursu = nazwaKursu;
	}

	public int getIdProwadzacego() {
		return idProwadzacego;
	}

	public void setIdProwadzacego(int idProwadzacego) {
		this.idProwadzacego = idProwadzacego;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public String getBudynek() {
		return budynek;
	}

	public void setBudynek(String budynek) {
		this.budynek = budynek;
	}

	public GodzinaZajec getGodzina() {
		return godzina;
	}

	public void setGodzina(GodzinaZajec godzina) {
		this.godzina = godzina;
	}

	public int getCzasTrwania() {
		return czasTrwania;
	}

	public void setCzasTrwania(int czasTrwania) {
		this.czasTrwania = czasTrwania;
	}

	public DzienTygodnia getDzien() {
		return dzien;
	}

	public void setDzien(DzienTygodnia dzien) {
		this.dzien = dzien;
	}

	public ParzystoscTygodnia getPrzystosc() {
		return przystosc;
	}

	public void setPrzystosc(ParzystoscTygodnia przystosc) {
		this.przystosc = przystosc;
	}

	public TypKursu getTyp() {
		return typ;
	}

	public void setTyp(TypKursu typ) {
		this.typ = typ;
	}

	public int getIdGrupyKursow() {
		return idGrupyKursow;
	}

	public void setIdGrupyKursow(int idGrupyKursow) {
		this.idGrupyKursow = idGrupyKursow;
	}

	public int getIloscECTS() {
		return iloscECTS;
	}

	public void setIloscECTS(int iloscECTS) {
		this.iloscECTS = iloscECTS;
	}
}