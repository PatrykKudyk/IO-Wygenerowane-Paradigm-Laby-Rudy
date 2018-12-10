package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Kurs {

	private int idKursu;
	private String nazwaKursu;
	private int idProwadzacego;
	private int sala;
	private String budynek;
	private GodzinaZajec godzina;
	private int czasTrwania;
	private DzienTygodnia dzien;
	private ParzystoscTygodnia parzystosc;
	private TypKursu typ;
	private int idGrupyKursow;
	private int iloscECTS;
	private int wolneMiejsca;
	private List<Integer> listaStudentow;
	private List<Integer> listaStudentowRezerwowych;

	public Kurs() {

	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Kurs kurs = (Kurs) o;
		return idGrupyKursow == kurs.idGrupyKursow &&
				iloscECTS == kurs.iloscECTS &&
				Objects.equals(nazwaKursu, kurs.nazwaKursu) &&
				typ == kurs.typ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nazwaKursu, typ, idGrupyKursow, iloscECTS);
	}

	public Kurs(int idKursu, String nazwaKursu, int idProwadzacego, int sala, String budynek, GodzinaZajec godzina, int czasTrwania, DzienTygodnia dzien, ParzystoscTygodnia parzystosc, TypKursu typ, int idGrupyKursow, int iloscECTS, int wolneMiejsca) {
		this.idKursu = idKursu;
		this.nazwaKursu = nazwaKursu;
		this.idProwadzacego = idProwadzacego;
		this.sala = sala;
		this.budynek = budynek;
		this.godzina = godzina;
		this.czasTrwania = czasTrwania;
		this.dzien = dzien;
		this.parzystosc = parzystosc;
		this.typ = typ;
		this.idGrupyKursow = idGrupyKursow;
		this.iloscECTS = iloscECTS;
		this.wolneMiejsca = wolneMiejsca;
		this.listaStudentow = new ArrayList<>();
		this.listaStudentowRezerwowych = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Kurs{" +
				"nazwaKursu='" + nazwaKursu + '\'' +
				", idProwadzacego=" + idProwadzacego +
				", sala=" + sala +
				", budynek='" + budynek + '\'' +
				", godzina=" + godzina.toString() +
				", czasTrwania=" + czasTrwania +
				", dzien=" + dzien +
				", parzystosc=" + parzystosc +
				", typ=" + typ +
				", idGrupyKursow=" + idGrupyKursow +
				", iloscECTS=" + iloscECTS +
				", wolneMiejsca=" + wolneMiejsca +
				'}';
	}

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

	public ParzystoscTygodnia getParzystosc() {
		return parzystosc;
	}

	public void setParzystosc(ParzystoscTygodnia parzystosc) {
		this.parzystosc = parzystosc;
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

	public int getWolneMiejsca() {
		return wolneMiejsca;
	}

	public void setWolneMiejsca(int wolneMiejsca) {
		this.wolneMiejsca = wolneMiejsca;
	}

	public List<Integer> getListaStudentow() {
		return listaStudentow;
	}

	public void setListaStudentow(List<Integer> listaStudentow) {
		this.listaStudentow = listaStudentow;
	}

	public List<Integer> getListaStudentowRezerwowych() {
		return listaStudentowRezerwowych;
	}

	public void setListaStudentowRezerwowych(List<Integer> listaStudentowRezerwowych) {
		this.listaStudentowRezerwowych = listaStudentowRezerwowych;
	}

	public void dodajDoListyStudentow(int idStudenta){
		this.listaStudentow.add(idStudenta);
	}

	public void dodajDoListyStudentowRezerwowych(int idStudenta){
		this.listaStudentowRezerwowych.add(idStudenta);
	}
}