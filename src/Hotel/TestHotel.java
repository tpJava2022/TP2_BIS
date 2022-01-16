package Hotel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chambre CA,CB;
		//Chambre CA,CB;
		//CA = Saisir_Chambre.saisir();
		CB=new Chambre(1,300,99,'O');
		CA=new Chambre(1,320,5,'L');
		
		Chambres chambres=new Chambres();
		
		chambres.ajouter(CB);
		chambres.ajouter(CA);
		chambres.sort();
		
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
		chambres.save("chambres.txt");
			
			chambres.displayByCat(1);
			
		
	}

}
