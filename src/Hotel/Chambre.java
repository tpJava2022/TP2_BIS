package Hotel;

public class Chambre {
     
	private static int num=0;
	private int Numero = ++num;
	private int Categorie;
	private double Prix;
	private int Capacite;
	private char Etat;
	
	public Chambre(int categorie, double prix, int capacite, char etat) {
		super();
		Categorie = categorie;
		Prix = prix;
		Capacite = capacite;
		Etat = etat;
	}
	
	public char getEtat() {
		return Etat;
	}
	public void setEtat(char etat) {
		Etat = etat;
	}
	public String toString()
	{
		String nv= "";
		nv = "------Chambre N°"+this.Numero+"-------"+"\n"
		+"Catégorie: "+this.Categorie+"\n"+
				"Capacité: "+this.Capacite+"\n"
				+"Prix: "+this.Prix+"\n"+"Etat: "+this.Etat;
		return nv;
		
	}
	
	
	
	
	
	
	
}
