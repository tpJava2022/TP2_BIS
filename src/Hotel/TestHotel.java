package Hotel;
import java.util.Scanner;

public class TestHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chambre CA,CB;
		Chambres chambres=Chambres.readFromFile("chambres.txt");
		Scanner cl=new Scanner(System.in);
		//CA = Saisir_Chambre.saisir();
		//CB=new Chambre(1,300,99,'O');
		//CA=new Chambre(1,320,5,'L');
		while(true) {
			System.out.println("1.saisissez une chambre.");
			System.out.println("2.supprimez une chambre.");
			System.out.println("3.afficher par categorie.");
			System.out.println("4.enregistrer.");
			System.out.println("5.quitter.");
			System.out.print("Saisissez un un choix : ");
			int choix=cl.nextInt();
			
			switch (choix) {
			case 1: {
				CA=Saisir_Chambre.saisir();
				chambres.ajouter(CA);
				break;
			}
			case 2:{
				System.out.print("donnez l'id de la chambre : ");
				int id=cl.nextInt();
				chambres.suprimer(id);
				break;
			}
			case 3:{
				System.out.print("donnez une categorie : ");
				int cat=cl.nextInt();
				chambres.displayByCat(cat);
				break;
			}
			case 4:{
				chambres.save("chambres.txt");
				break;
			}
			case 5:{
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choix);
			}
		}
		
		//chambres=Chambres.readFromFile("chambres.txt");
		//chambres=new Chambres();
		/*chambres.ajouter(CB);
		chambres.ajouter(CA);
		chambres.sort();*/
		
		/*chambres.displayByCat(1);
		File f=new File("chambres.txt");
		System.out.println(CA);
		System.out.println(CB);*/
		
			//FileOutputStream fos=new FileOutputStream("chambres.txt");
			/*CB=new Chambre(1,300,99,'O');
			CA=new Chambre(1,320,5,'L');*/
			//Chambres chambres=Chambres.readFromFile("chambres.txt");
			/*chambres.ajouter(CB);
			chambres.ajouter(CA);
			chambres.sort();*/
			//chambres.readFromFile("chambres.txt");
		//chambres.save("chambres.txt",1);
			
		//chambres.displayByCat(1);
			
		
	}

}
