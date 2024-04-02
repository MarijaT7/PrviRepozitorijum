package novogodisnjiPaketic;


public class Test {

	public static void main(String[] args) {
		NovogodisnjiPaketic n = new NovogodisnjiPaketic("Lep", "za decaka", false, 6, true, true);
		n.spakuj();
		System.out.println("\n" + n);
		
		System.out.println("\n***********DEDA MRAZ**********");
		DedaMraz d = new DedaMraz();
		d.dodaj(n);
		System.out.println("\n" + d);
		System.out.println("Izbacen paketic: \n" + d.izbaci("Lep", 6));
		d.dodaj(n);
		d.pripremiZaIsporuku(n, "Lalala");
		
		NovogodisnjiPaketic ng = new NovogodisnjiPaketic("Simpatican", "za devojcicu", true, 4, true, true);
		d.dodaj(ng);
		System.out.println("\nProsecni uzrast = " + d.prosecniMinimalniUzrast()); 
	
		System.out.println(d.sifrujNamenjen());
	}

}
