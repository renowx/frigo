package frigo;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
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
				int choix2 = 0;
				while(choix2 == 0){
					System.out.println("Que voulez-vous faire ?\n");
					System.out.println("1) ajoutez un aliment");
					System.out.println("2) retirez un aliment");
					while(choix2<1 || choix2>2){
						System.out.println("Faites un choix valide entre 1 et 2");
						try {
							choix2 = Integer.parseInt(sc.nextLine());
						} catch (NumberFormatException e) {

						}
						if(choix<1 || choix>2){
							System.out.println("Ceci n'est pas un choix valide\n");
						}
					}
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				}

				switch (choix2) {
				case 1: // ajouter un aliment
					int choix3 = 0;
					while(choix3 == 0){
						System.out.println("Que voulez vous ajouter ?\n");
						System.out.println("1) Un fruit");
						System.out.println("2) Un produit laitier");
						System.out.println("3) Un legume");
						System.out.println("4) De la viande");
						while(choix3<1 || choix3>4){
							System.out.println("Faites un choix valide entre 1 et 4");
							try {
								choix3 = Integer.parseInt(sc.nextLine());
							} catch (NumberFormatException e) {

							}
							if(choix3<1 || choix3>4){
								System.out.println("Ceci n'est pas un choix valide\n");
							}
						}
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					}

					System.out.println("Quel est le nom de votre aliment?");
					String nom = sc.nextLine();

					System.out.println("En quel quantité?");
					int qute = Integer.parseInt(sc.nextLine());

					System.out.println("Quel est sa date de péremption?(format mm/jj/aaaa)");
					System.out.println("(ecrire no si il y en a pas)");
					String dateRecup = sc.nextLine();
					String unite;

					switch (choix3) {
					case 1: // un fruit

						if(dateRecup.equals("no")){
							frigo.setAliments(new Fruit(nom, qute, ""));
						}
						else{
							try {
								frigo.setAliments(new Fruit(nom, new Date(dateRecup), qute, ""));
							} catch (Exception e) {
								// TODO: handle exception
							}
						}
						choix = 0;
						break;
					case 2: // laitier

						System.out.println("Quel est l'unité de votre produit laitier (gramme, litre ou unite)");
						unite = sc.nextLine();
						if(unite.equals("unite")){
							unite = "";
						}
						if(dateRecup.equals("no")){
							frigo.setAliments(new Laitier(nom, qute, unite));
						}
						else{
							try {
								frigo.setAliments(new Laitier(nom, new Date(dateRecup), qute, unite));
							} catch (Exception e) {
								// TODO: handle exception
							}
						}
						choix = 0;
						break;
					case 3: // Legume

						System.out.println("Quel est l'unité de votre legume (gramme ou unite)");
						unite = sc.nextLine();
						if(unite.equals("unite")){
							unite = "";
						}
						if(dateRecup.equals("no")){
							frigo.setAliments(new Legume(nom, qute, unite));
						}
						else{
							try {
								frigo.setAliments(new Legume(nom, new Date(dateRecup), qute, unite));
							} catch (Exception e) {
								// TODO: handle exception
							}
						}
						choix = 0;
						break;
				case 4: // Viande

						
						if(dateRecup.equals("no")){
							frigo.setAliments(new Legume(nom, qute, "gramme"));
						}
						else{
							try {
								frigo.setAliments(new Legume(nom, new Date(dateRecup), qute, "gramme"));
							} catch (Exception e) {
								// TODO: handle exception
							}
						}
						choix = 0;
						break;

					default:
						break;

					}
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					break;
				case 2 : 
					System.out.println("Quel est le nom de l'aliment que vous souhaitez retirer : ");
					nom = sc.nextLine();
					System.out.println("En quelle quantité?");
					qute = Integer.parseInt(sc.nextLine());
					
					for (Aliment ali : frigo.getListeAliments()) { 
						if(ali.getNom().equals(nom)){
							//if(ali.getQuantite()>qute){
								frigo.retirerQuantite(ali, qute);
							//}
							if(ali.getQuantite()==0){
								frigo.enleverAliments(nom);
							}
							
						}
					}
					choix = 0;
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

