package novogodisnjaRasveta;

public class Test {

	public static void main(String[] args) {
		Lampion l1 = new Lampion(123, "Plava", true, 690);
		Lampion l2 = new Lampion(l1);
		
		l2.setSifra(69);
		l2.popravi();
		l2.setCena(350);
		System.out.println("*********LAMPION*********\n");
		System.out.println("Ispitivanje getera kod lampriona2");
		System.out.println("Sifra = " + l2.getSifra());
		System.out.println("Boja = " + l2.getBoja());
		System.out.println("Ispravan = " + ((l2.isIspravan())? "Ispravan" : "Nije ispravan") );
		System.out.println("Cena = " + l2.getCena());
		
		System.out.println("\nIspitivanje metode toString kod lampiona1");
		System.out.println(l1);
		

		NovogodisnjaRasveta n = new NovogodisnjaRasveta();
		n.dodaj(l2);
		n.dodaj(l1);
		n.pronadji(1, "Plava");
		System.out.println(n);
		if(n.postaviAkciju()) {
			System.out.println("Uspesno postavljanje akcije");
		}
		else {
			System.out.println("Neuspesno postavljanje akcije");
		}
	}

}
