package novogodisnjiPaketic;

import java.util.ArrayList;
import java.util.HashMap;

public class DedaMraz {
	private HashMap<String, NovogodisnjiPaketic>paketici;
	
	public DedaMraz() {
		paketici = new HashMap<String, NovogodisnjiPaketic>();
	}
	
	public boolean pripremiZaIsporuku(NovogodisnjiPaketic n, String s) {
		if(n.spakuj()) {
			n.setOpis(s);
			n.setSpremanZaIsporuku(true); 
			System.out.println("Novogodisnji paketic je spreman za isporuku");
			return true;
		}
		return false;
	}
	
	public boolean dodaj(NovogodisnjiPaketic n) {
		if(!n.isSpremanZaIsporuku()) {
			return false;
		}
		
		String kljuc = n.getOpis().substring(0, 3) + ":" + n.getMinimalanUzrast();
		
		if(paketici.containsKey(kljuc)) {
			return false;
		}
		else {
			paketici.put(kljuc, n);
			return true;
		}
	}
	
	
	public NovogodisnjiPaketic izbaci(String opis, int minUzrast) {
		String kljuc = opis.substring(0,3) + ":" + minUzrast;
		return paketici.remove(kljuc);
	}
	
	public double prosecniMinimalniUzrast() {
		double g = 0;
		for(NovogodisnjiPaketic n : paketici.values()) {
			g += n.getMinimalanUzrast();
		}
		return g/paketici.size();
	}

	@Override
	public String toString() {
		if(paketici.isEmpty()) {
			return "Prazna mapa";
		}
		String s = "SADRZAJ\n";
		
		for(NovogodisnjiPaketic n : paketici.values()) {
			s += n;
			s += "\n";
		}
		
		return s;
	}
	
	public ArrayList<String>sifrujNamenjen(){
		ArrayList<String>s = new ArrayList<String>();
		
		for(NovogodisnjiPaketic n : paketici.values()) {
			String sifra = n.getOpis();
			sifra.trim();
			sifra.toUpperCase();
			int l = sifra.length();
			if(l > 5) {
				sifra = sifra.charAt(l-1) + sifra.substring(1, l - 1) + sifra.charAt(0);
			}
			else {
				sifra = sifra.replace("a", "e");
				sifra = sifra.replace("e", "i");
				sifra = sifra.replace("i", "o");
			}
			s.add(sifra);
		}
		return s;
	}
	
	
	
}
