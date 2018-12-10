package com.company;

import java.util.List;

public class Student extends Uzytkownik {

	private List<Integer> idKierunkow;
	private int idSemestru;
	private TypStudiow typStudiow;

	public Student() {

	}

	public Student(List<Integer> idKierunkow, int idSemestru, TypStudiow typStudiow, int idStudenta) {

		this.idKierunkow = idKierunkow;
		this.idSemestru = idSemestru;
		this.typStudiow = typStudiow;
	}

	public void ZapisNaKursy() {
	}

	public void ZatwierdzWystawionaOcene() {
	}

	public void PoprosOUtworzenieKursu() {
	}

	public List<Integer> getIdKierunkow() {
		return idKierunkow;
	}

	public void setIdKierunkow(List<Integer> idKierunkow) {
		this.idKierunkow = idKierunkow;
	}

	public int getIdSemestru() {
		return idSemestru;
	}

	public void setIdSemestru(int idSemestru) {
		this.idSemestru = idSemestru;
	}

	public TypStudiow getTypStudiow() {
		return typStudiow;
	}

	public void setTypStudiow(TypStudiow typStudiow) {
		this.typStudiow = typStudiow;
	}
}