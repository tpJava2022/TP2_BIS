package Hotel;

public class TestHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chambre CA,CB;
		CA = Saisir_Chambre.saisir();
		CB=new Chambre(1,300,4,'O');
		System.out.println(CA);
		System.out.println(CB);
	}

}
