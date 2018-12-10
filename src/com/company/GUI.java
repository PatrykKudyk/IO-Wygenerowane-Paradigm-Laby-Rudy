package com.company;

import sun.awt.geom.AreaOp;

import java.util.List;
import java.util.Scanner;

public class GUI {

	public void WyswietlGlowneMenu(Uzytkownik uzytkownik) {
		Scanner skaner = new Scanner(System.in);
		System.out.println("\t\tMenu Główne Programu");
		System.out.println("\nCo chciałbyś teraz zrobić?");
		if( == Uprawnienia.Student){
			System.out.println("[1] - Wyświetlić Listę Kursów");
			System.out.println("[2] - Wyświetlić Listę Grup Zapisowych");
			System.out.println("[3] - Wyświetlić Oceny");
			System.out.println("[4] - Wyświetlić Plan");
			int wybor = skaner.nextInt();
			switch(wybor){
				case 1:
					WyswietlListeKursow();
			}
		}
		else if(uprawnienia == Uprawnienia.Prowadzacy){
			System.out.println("[1] - Wyświetlić Listę Studentów");
			System.out.println("[4] - Wyświetlić Plan");
		}


	}

	public void WyswietlListeKursow() {
	}

	public void WyswietlListeGrupZapisowych(List<GrupaZapisowa> lista) {
		System.out.println("Poniżej znajduje się lista grup zapisowych:");
		for(int i=0;i < lista.size(); i++)
			System.out.println(lista.get(i));
	}

	public void WyswietlKomunikat(String komunikat) {
		System.out.println(komunikat);
	}

	public void WyswietlMenuLogowania() {
	}

	public void WyswietlListeStudentow() {
	}

	public void WyswietlOceny() {
	}

	public void WyswietlPlan() {
	}

}