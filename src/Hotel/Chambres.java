package Hotel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Chambres {
	private ArrayList<Chambre> listeDesChambres;
	
	public Chambres(){
		listeDesChambres=new ArrayList<Chambre>();
	}
	
	public void ajouter(Chambre chambre) {
		listeDesChambres.add(chambre);
	}
	
	public boolean suprimer(Chambre chambre) {
		return listeDesChambres.remove(chambre);
	}
	
	public void displayByCat(int category) {
		
		for(Chambre chamber: listeDesChambres) {
			if(chamber.getCategorie()==category)
				System.out.println(chamber);
		}
	}
	
	public void sort(){
		Collections.sort(listeDesChambres);
	}
	
	public void save(String file) {
		
		FileWriter fos;
		try {
			fos = new FileWriter(file);
			for(Chambre chamber:listeDesChambres) {
				fos.write("\nla chambre :\n"+chamber.getNumero()+"\n");
				fos.write("\nla categorie :\n"+chamber.getCategorie()+"\n");
				fos.write("\nla capacite :\n"+chamber.getCapacite()+"\n");
				fos.write("\nle prix :\n"+chamber.getPrix()+"\n");
				fos.write("\nl'etat :\n"+chamber.getEtat()+"\n");
			}
			
			fos.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	}
	
	public void readFromFile(String file) {
		ArrayList<Chambre> list =new ArrayList<Chambre>();
		try {
			FileReader fr=new FileReader(file);
			Scanner scanner=new Scanner(fr);
			while(scanner.hasNext()) {
				Chambre c=new Chambre();
				scanner.nextLine();
				scanner.nextLine();
				c.setNumero(scanner.nextInt());
				//System.out.println(scanner.nextInt());
				scanner.next().charAt(0);
				scanner.nextLine();
				c.setCategorie(scanner.nextInt());
				//System.out.println(scanner.nextInt());
				scanner.next().charAt(0);
				scanner.nextLine();
				c.setCapacite(scanner.nextInt());
				//System.out.println(scanner.nextInt());
				scanner.next().charAt(0);
				scanner.nextLine();
				c.setPrix(scanner.nextDouble());
				//System.out.println(scanner.nextFloat());
				scanner.next().charAt(0);
				scanner.nextLine();
				c.setEtat(scanner.next().charAt(0));
				//System.out.println(scanner.next().charAt(0));
				scanner.nextLine();
				list.add(c);
				
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		listeDesChambres=list;
	}
}
