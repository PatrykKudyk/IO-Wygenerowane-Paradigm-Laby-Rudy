package com.company;

import sun.awt.geom.AreaOp;

import java.util.List;
import java.util.Scanner;

public class GUI {

	public void WyswietlGlowneMenu(Uprawnienia uprawnienia, int idUzytkownika) {
		Scanner skaner = new Scanner(System.in);
		System.out.println("\t\tMenu Główne Programu");
		System.out.println("\nCo chciałbyś teraz zrobić?");
		if(uprawnienia == Uprawnienia.Student){
			System.out.println("[1] - Zapisz na kursy");
			System.out.println("[2] - Wyświetlić Listę Grup Zapisowych");
			System.out.println("[3] - Wyświetlić Oceny");
			System.out.println("[4] - Wyświetlić Plan");
			int wybor = skaner.nextInt();
			switch(wybor){
				case 1:
					WyswietlListeKursow(idUzytkownika);
					break;
				case 2:
					ZarzadcaKursow zarzadcaKursow = new ZarzadcaKursow();
					WyswietlListeGrupZapisowych(zarzadcaKursow.PobierzListeGrupZapisowych());
					break;
				case 3:
					WyswietlOceny();
					break;
				case 4:
					WyswietlPlan();
					break;
					default:
						break;
			}
		}
		else if(uprawnienia == Uprawnienia.Prowadzacy){
			System.out.println("[1] - Wyświetlić Listę Studentów");
			System.out.println("[2] - Wyświetlić Plan");
			int wybor = skaner.nextInt();
			switch(wybor){
				case 1:
					WyswietlListeStudentow();
					break;
				case 2:
					WyswietlPlan();
					break;
					default:
						break;
			}
		}


	}

	public void WyswietlListeKursow(int idUzytkownika) {
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