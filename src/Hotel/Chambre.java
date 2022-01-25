package Hotel;

public class Chambre implements Comparable<Chambre> {
     
	private static int num=0;
	private int Numero;
	private int Categorie;
	private double Prix;
	private int Capacite;
	private char Etat;
	
	
	public Chambre(int categorie, double prix, int capacite, char etat) {
		Numero = ++num;
		Categorie = categorie;
		Prix = prix;
		Capacite = capacite;
		Etat = etat;
	}
	
	public Chambre(int numero, int categorie, double prix, int capacite, char etat) {
		++num;
		Numero = numero;
		Categorie = categorie;
		Prix = prix;
		Capacite = capacite;
		Etat = etat;
	}

	public char getEtat() {
		return Etat;
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
	
	public int getCategorie(){
		
		return Categorie;
	}
	
	public int getId() {
		return Numero;
	}
	

	@Override
	public int compareTo(Chambre o) {
		if(this.Capacite>o.Capacite)	return 1;
		if(this.Capacite<o.Capacite)	return -1;
		return 0;
	}

	public int getNumero() {
		return Numero;
	}

	public double getPrix() {
		return Prix;
	}

	public int getCapacite() {
		return Capacite;
	}
	
}
