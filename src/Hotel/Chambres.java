package Hotel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
	
	public void sort() {
		Collections.sort(listeDesChambres);
	}
	
	public void save(String file) {
		
		FileWriter fos;
		try {
			fos = new FileWriter(file);
			for(Chambre chamber:listeDesChambres) {
				fos.write("\n la chambre n:\n"+chamber.getNumero()+"\n");
				fos.write("\n la categorie n:\n"+chamber.getCategorie()+"\n");
				fos.write("\n la capacite n:\n"+chamber.getCapacite()+"\n");
				fos.write("\n le prix n:\n"+chamber.getPrix()+"\n");
				fos.write("\n l'etat n:\n"+chamber.getEtat()+"\n\n");
			}
			
			fos.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
