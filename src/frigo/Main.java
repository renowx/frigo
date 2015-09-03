package frigo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.io.Console;


public class Main {

	public static void main (String [] arg  ){

		Frigo frigo = new Frigo(); 

		Aliment tomate = new Fruit("tomate", new Date(2015, 12, 6), 4, "");
		Aliment eggs = new Viande("egg", new Date(2015, 9, 10), 4, "");
		Aliment beurre = new Laitier("beurre", new Date(2015, 10, 6), 250, "g");

		frigo.setAliments(tomate);
		frigo.setAliments(eggs);
		frigo.setAliments(beurre);


		System.out.println("******************************");
		System.out.println("* Bienvenue dans votre frigo *");
		System.out.println("******************************");
		System.out.println("\n\n");

		int choix = 0;

		while(choix == 0){


			System.out.println("Que voulez-vous faire ?\n");
			System.out.println("1) Voir le contenu de votre frigo");
			System.out.println("2) Ajouter ou retirer un aliment");
			System.out.println("3) Consulter les recettes\n");

			Scanner sc = new Scanner(System.in);

			while(choix<1 || choix>3){
				System.out.println("Faites un choix valide entre 1 et 3");
				try {
					choix = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {

				}
				if(choix<1 || choix>3){
					System.out.println("Ceci n'est pas un choix valide\n");
				}
			}
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

			switch (choix) {
			case 1: // afficher le frigo
				System.out.println(frigo);
				choix = 0;
				break;
			case 2: // ajouter ou enlever un aliment
				int choixBis = 0;
				while(choixBis == 0){
					System.out.println("Que voulez-vous faire ?\n");
					System.out.println("1) ajoutez un aliment");
					System.out.println("2) retirez un aliment");
					while(choixBis<1 || choixBis>2){
						System.out.println("Faites un choix valide entre 1 et 2");
						try {
							choixBis = Integer.parseInt(sc.nextLine());
						} catch (NumberFormatException e) {

						}
						if(choix<1 || choix>2){
							System.out.println("Ceci n'est pas un choix valide\n");
						}
					}
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				}

				switch (choixBis) {
				case 1: // ajouter un aliment
					int choixBisBis = 0;
					while(choixBisBis == 0){
						System.out.println("Que voulez vous ajouter ?\n");
						System.out.println("1) Un fruit");
						System.out.println("2) Un produit laitier");
						System.out.println("3) Un legume");
						System.out.println("4) De la viande");
						while(choixBisBis<1 || choixBis>4){
							System.out.println("Faites un choix valide entre 1 et 4");
							try {
								choixBisBis = Integer.parseInt(sc.nextLine());
							} catch (NumberFormatException e) {

							}
							if(choix<1 || choix>4){
								System.out.println("Ceci n'est pas un choix valide\n");
							}
						}
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					}
					break;
				case 2 : //retirer un aliment

					break;

				default : 

					break;
				}
				break;
			case 3 : //proposer des recettes

				break;
			default : 

				break;
			}

		}

	}
}

