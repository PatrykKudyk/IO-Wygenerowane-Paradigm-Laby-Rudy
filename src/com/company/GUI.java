package com.company;

import java.util.List;

public class GUI {

	public void WyswietlGlowneMenu(Uprawnienia uprawnienia) {
		System.out.println("\t\tMenu Główne Programu");
		System.out.println("\nCo chciałbyś teraz zrobić?");
		if(uprawnienia == Uprawnienia.Student){
			System.out.println("[1] - Zapisz na kursy");
			System.out.println("[2] - Wyświetlić Listę Grup Zapisowych");
			System.out.println("[3] - Wyświetlić Oceny");
			System.out.println("[4] - Wyświetlić Plan");
		}
		else if(uprawnienia == Uprawnienia.Prowadzacy){
			System.out.println("[1] - Wyświetlić Listę Studentów");
			System.out.println("[2] - Wyświetlić Plan");
		}
		else if(uprawnienia == Uprawnienia.Planista){
			System.out.println("[1] - Zmodyfikować Bazę Kursów");
			System.out.println("[2] - Utworzyć Kurs");
		}
	}

	public void WyswietlListeKursow(List <Kurs> lista) {
		System.out.println("Poniżej znajduje się lista kursów:");
		for(int i=0;i < lista.size(); i++)
			System.out.println(i + ") " + lista.get(i).toString());
	}

	public void WyswietlListeGrupZapisowych(List<GrupaZapisowa> lista) {
		System.out.println("Poniżej znajduje się lista grup zapisowych:");
		for(int i=0;i < lista.size(); i++)
			System.out.println(i + " Nazwa - " + lista.get(i).getNazwaGrupy());
	}

	public void WyswietlKomunikat(String komunikat) {
		System.out.println(komunikat);
	}

	public void WyswietlMenuLogowania() {
		System.out.println("Podaj dane logowania");
		System.out.println("Login: ");
	}

	public void WyswietlListeStudentow(List <Student> lista) {
		System.out.println("Lista studentow: ");
		for(int i = 0; i < lista.size(); i++)
			System.out.println(i + ") - " + lista.get(i).getImie()+ lista.get(i).getNazwisko());
	}



	public void WyswietlOceny() {
	}

	public void WyswietlPlan(List<Kurs> lista) {

	}

}