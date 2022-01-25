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
	public Chambres(ArrayList<Chambre> list){
		//listeDesChambres=new ArrayList<Chambre>();
		listeDesChambres=list;
	}
	
	public void ajouter(Chambre chambre) {
		listeDesChambres.add(chambre);
	}
	
	public boolean suprimer(Chambre chambre) {
		return listeDesChambres.remove(chambre);
	}
	
	public boolean suprimer(int id) {
		for(Chambre chambre :listeDesChambres) {
			if(chambre.getId()==id)
				return listeDesChambres.remove(chambre);
		}
		return false;
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
	
	public void save(String file,int categorie) {
		
		FileWriter fos;
		try {
			fos = new FileWriter(file);
			for(Chambre chamber:listeDesChambres) {
				if(chamber.getCategorie()==categorie) {
					fos.write("la chambre :\n"+chamber.getNumero()+"\n");
					fos.write("la categorie :\n"+chamber.getCategorie()+"\n");
					fos.write("la capacite :\n"+chamber.getCapacite()+"\n");
					fos.write("le prix :\n"+chamber.getPrix()+"\n");
					fos.write("l'etat :\n"+chamber.getEtat()+"\n\n");
				}
			}
			
			fos.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	}
	
	public void save(String file) {
		
		FileWriter fos;
		try {
			fos = new FileWriter(file);
			for(Chambre chamber:listeDesChambres) {
				fos.write("la chambre :\n"+chamber.getNumero()+"\n");
				fos.write("la categorie :\n"+chamber.getCategorie()+"\n");
				fos.write("la capacite :\n"+chamber.getCapacite()+"\n");
				fos.write("le prix :\n"+chamber.getPrix()+"\n");
				fos.write("l'etat :\n"+chamber.getEtat()+"\n\n");
			}
			
			fos.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	}
	
	public static Chambres readFromFile(String file) {
		ArrayList<Chambre> list =new ArrayList<Chambre>();
		try {
			FileReader fr=new FileReader(file);
			Scanner scanner=new Scanner(fr);
			while(scanner.hasNext()) {
				scanner.nextLine();
				int num=scanner.nextInt();
				scanner.next().charAt(0);
				scanner.nextLine();
				int categorie=scanner.nextInt();
				scanner.next().charAt(0);
				scanner.nextLine();
				int capacite=scanner.nextInt();
				scanner.next().charAt(0);
				scanner.nextLine();
				double prix=scanner.nextDouble();
				scanner.next().charAt(0);
				scanner.nextLine();
				char etat=scanner.next().charAt(0);
				
				Chambre c=new Chambre(num,categorie,prix,capacite,etat);
				scanner.nextLine();
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
		//listeDesChambres=list;
		return new Chambres(list);
	}
}
