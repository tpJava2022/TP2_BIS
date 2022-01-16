package Hotel;

public class Chambre implements Comparable<Chambre> {
     
	private static int num=0;
	private int Numero = ++num;
	private int Categorie;
	private double Prix;
	private int Capacite;
	private char Etat;
	
	public Chambre(){
		++num;
	}
	
	public Chambre(int categorie, double prix, int capacite, char etat) {
		super();
		Categorie = categorie;
		Prix = prix;
		Capacite = capacite;
		Etat = etat;
	}
	
	public void setNumero(int numero) {
		Numero = numero;
	}

	public void setCategorie(int categorie) {
		Categorie = categorie;
	}

	public void setPrix(double prix) {
		Prix = prix;
	}

	public void setCapacite(int capacite) {
		Capacite = capacite;
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
	
	public int getCategorie(){
		
		return Categorie;
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
