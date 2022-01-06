package Hotel;

import java.util.Scanner;

public class Saisir_Chambre {

	public static Chambre saisir() {
		int c,cap;
		double p;
		Scanner s =new Scanner(System.in);
		System.out.println("Donner la categorie: ");
		c=s.nextInt();
		do {
		System.out.println("Donner la capacite: ");
		
		cap = s.nextInt();
		
		}while(cap <1 || cap >4);
		
		do {
			System.out.println("Donner le prix: ");
			
			p = s.nextDouble();
			
			}while(p <=0);
		
		return new Chambre(c,p,cap,'L');
	}
	
	
	
	
}
