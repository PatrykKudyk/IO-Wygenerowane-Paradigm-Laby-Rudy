package com.company;

public class GodzinaZajec {

	private int idGodzinyZajec;
	private int godzina;
	private int minuta;

	public GodzinaZajec(int godzina, int minuta) {
		this.godzina = godzina;
		this.minuta = minuta;
	}

	@Override
	public String toString() {
		return "GodzinaZajec{" +
				"godzina=" + godzina +
				", minuta=" + minuta +
				'}';
	}

	public int getIdGodzinyZajec() {
		return idGodzinyZajec;
	}

	public void setIdGodzinyZajec(int idGodzinyZajec) {
		this.idGodzinyZajec = idGodzinyZajec;
	}

	public int getGodzina() {
		return godzina;
	}

	public void setGodzina(int godzina) {
		this.godzina = godzina;
	}

	public int getMinuta() {
		return minuta;
	}

	public void setMinuta(int minuta) {
		this.minuta = minuta;
	}
}