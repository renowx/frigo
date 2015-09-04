package frigo;

import java.util.Scanner;

public class Menu {


	public Menu() {
		
	}
	
	public void enteteDebut(){
		System.out.println("******************************");
		System.out.println("* Bienvenue dans votre frigo *");
		System.out.println("******************************");
		System.out.println("\n\n");
	}

	public int menuDebut() {
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
		}
		return choix;
	}
}
