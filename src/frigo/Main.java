package frigo;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Main {

	public static void main (String [] arg  ){
		//menuCrade();
		/*Frigo frigo = new Frigo();
		Aliment tomate = new Fruit("tomate", new Date(2015, 12, 6), 4, "");
		Aliment eggs = new Viande("egg", new Date(2015, 9, 10), 4, "");
		Aliment beurre = new Laitier("beurre", new Date(2015, 10, 6), 250, "g");

		frigo.setAliments(tomate);
		frigo.setAliments(eggs);
		frigo.setAliments(beurre);
		
		Menu menu = new Menu();
		menu.enteteDebut();
		
		int choix = menu.menuDebut();
		ActionMenu action = new ActionMenu(choix, frigo);
		if(choix==1){
				action.consulterFrigo();
		}
		
		Action monAction = menu.getAction();
		while (monaction != null) {
			monAction.run();
			monAction = menu.getAction();
		}*/
		/*GregorianCalendar greg = new GregorianCalendar(2015,6,11);
		System.out.println(greg.get);*/

		Frigo frigo = new Frigo();
		Aliment tomate = new Fruit("tomate", new GregorianCalendar(2015, 06, 11), 4, "");
		Aliment oeufs = new Viande("oeuf", new GregorianCalendar(2015, 9, 10), 6, "");
		Aliment rape = new Laitier("rape", new GregorianCalendar(2015, 10, 6), 100, "g");
		Aliment poulet = new Viande("poulet", new GregorianCalendar(2015, 9, 8), 1000, "g");
		Aliment boeuf = new Viande("boeuf", new GregorianCalendar(2015, 9, 15), 800, "g");
		Aliment frites = new Legume("frites", new GregorianCalendar(2016, 9, 10), 1500, "g");
		Aliment haricots = new Legume("haricots", new GregorianCalendar(2015, 9, 20), 250, "g");
		Aliment dinde = new Viande("dinde", new GregorianCalendar(2015, 9, 30), 300, "g");
		Aliment cremeFraiche = new Laitier("creme", new GregorianCalendar(2015, 9, 15), 100, "g");
		
		frigo.setAliments(tomate);
		frigo.setAliments(oeufs);
		frigo.setAliments(rape);
		frigo.setAliments(poulet);
		frigo.setAliments(boeuf);
		frigo.setAliments(frites);
		frigo.setAliments(haricots);
		frigo.setAliments(dinde);
		frigo.setAliments(cremeFraiche);

		Aliment tomateR = new Fruit("tomate", new GregorianCalendar(2015, 12, 6), 4, "");
		Aliment boeufR = new Viande("boeuf", new GregorianCalendar(2015, 9, 15), 400, "g");
		ArrayList<Aliment> boloA = new ArrayList<Aliment>();
		boloA.add(tomateR);
		boloA.add(boeufR);
		Recette bolo = new Recette("bolognaise", boloA);
		
		Aliment oeufsR = new Viande("oeuf", new GregorianCalendar(2015, 9, 10), 4, "");
		Aliment rapeR = new Laitier("rape", new GregorianCalendar(2015, 10, 6), 30, "g");
		ArrayList<Aliment> omeletteA = new ArrayList<Aliment>();
		omeletteA.add(oeufsR);
		omeletteA.add(rapeR);
		Recette omelette = new Recette("omelette", omeletteA);
		
		Aliment pouletR = new Viande("poulet", new GregorianCalendar(2015, 9, 8), 1000, "g");
		Aliment fritesR = new Legume("frites", new GregorianCalendar(2016, 9, 10), 600, "g");
		ArrayList<Aliment> chickenA = new ArrayList<Aliment>();
		chickenA.add(pouletR);
		chickenA.add(fritesR);
		Recette chickNFries = new Recette("chickNFries", chickenA);
		
		Aliment haricotsR = new Legume("haricots", new GregorianCalendar(2015, 9, 20), 150, "g");
		Aliment dindeR = new Viande("dinde", new GregorianCalendar(2015, 9, 30), 300, "g");
		Aliment cremeFraicheR = new Laitier("creme", new GregorianCalendar(2015, 9, 15), 20, "g");
		ArrayList<Aliment> escalopeA = new ArrayList<Aliment>();
		escalopeA.add(haricotsR);
		escalopeA.add(dindeR);		
		escalopeA.add(cremeFraicheR);
		Recette escalope = new Recette("escalope de dinde a la creme + haricots", escalopeA);
		
		frigo.setListeRecettes(bolo);
		frigo.setListeRecettes(escalope);
		frigo.setListeRecettes(chickNFries);
		frigo.setListeRecettes(omelette);
		


		System.out.println("******************************");
		System.out.println("* Bienvenue dans votre frigo *");
		System.out.println("******************************");
		System.out.println("\n\n");

		int choix = 0;

		while(choix == 0){

			System.out.println("Que voulez-vous faire ?\n");
			System.out.println("1) Voir le contenu de votre frigo");
			System.out.println("2) Ajouter ou retirer un aliment");
			//System.out.println("3) Consulter les recettes\n");

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

					System.out.println("En quel quantitï¿½?");
					int qute = Integer.parseInt(sc.nextLine());

<<<<<<< HEAD
					System.out.println("Quel est sa date de péremption?(format jj/mm/aaaa)");
=======
					System.out.println("Quel est sa date de pï¿½remption?(format mm/jj/aaaa)");
>>>>>>> origin/master
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
								frigo.setAliments(new Fruit(nom, new GregorianCalendar(Integer.parseInt(dateRecup.substring(0, 2)),Integer.parseInt(dateRecup.substring(3, 5))-1,Integer.parseInt(dateRecup.substring(6, 10))), qute, ""));
								//frigo.setAliments(new Fruit(nom, qute, ""));
							} catch (Exception e) {
								// TODO: handle exception
							}
						}
						choix = 0;
						break;
					case 2: // laitier

						System.out.println("Quel est l'unitï¿½ de votre produit laitier (gramme, litre ou unite)");
						unite = sc.nextLine();
						if(unite.equals("unite")){
							unite = "";
						}
						if(dateRecup.equals("no")){
							frigo.setAliments(new Laitier(nom, qute, unite.substring(0,1)));
						}
						else{
							try {
								frigo.setAliments(new Laitier(nom, new GregorianCalendar(Integer.parseInt(dateRecup.substring(0, 2)),Integer.parseInt(dateRecup.substring(3, 5))-1,Integer.parseInt(dateRecup.substring(6, 10))), qute, unite.substring(0,1)));
								//frigo.setAliments(new Laitier(nom, qute, unite));
							} catch (Exception e) {
								// TODO: handle exception
							}
						}
						choix = 0;
						break;
					case 3: // Legume

						System.out.println("Quel est l'unitï¿½ de votre legume (gramme ou unite)");
						unite = sc.nextLine();
						if(unite.equals("unite")){
							unite = "";
						}
						if(dateRecup.equals("no")){
							frigo.setAliments(new Legume(nom, qute, unite.substring(0,1)));
						}
						else{
							try {
								frigo.setAliments(new Legume(nom, new GregorianCalendar(Integer.parseInt(dateRecup.substring(0, 2)),Integer.parseInt(dateRecup.substring(3, 5))-1,Integer.parseInt(dateRecup.substring(6, 10))), qute, unite.substring(0,1)));
								//frigo.setAliments(new Legume(nom, qute, unite));
							} catch (Exception e) {
								// TODO: handle exception
							}
						}
						choix = 0;
						break;
				case 4: // Viande

						
						if(dateRecup.equals("no")){
							frigo.setAliments(new Legume(nom, qute, "g"));
						}
						else{
							try {
								frigo.setAliments(new Legume(nom, new GregorianCalendar(Integer.parseInt(dateRecup.substring(0, 2)),Integer.parseInt(dateRecup.substring(3, 5))-1,Integer.parseInt(dateRecup.substring(6, 10))), qute, "g"));
								//frigo.setAliments(new Legume(nom, qute, "gramme"));
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
					System.out.println("En quelle quantitï¿½?");
					qute = Integer.parseInt(sc.nextLine());
					
					boolean sort = true;
					for (Aliment ali : frigo.getListeAliments()) { 
						if(ali.getNom().equals(nom) && sort){
							//if(ali.getQuantite()>qute){
								frigo.retirerQuantite(ali, qute);
								sort = false;
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
				System.out.println(frigo.recetteContenu());
				choix = 0;
				break;
			default : 

				break;
			}

		}

	}

}


