package novogodisnjaRasveta;

import java.util.ArrayList;
import java.util.Scanner;

public class NovogodisnjaRasveta {
	private int kapacitet = 5;
	private ArrayList<Lampion>lampioni;
	
	public NovogodisnjaRasveta() {
		lampioni = new ArrayList<Lampion>();
	}
	public boolean dodaj(Lampion l) {
		if(lampioni.size() >= kapacitet || l.isIspravan() == false) {
			return false;
		}
		for(int i = 0; i < lampioni.size(); i ++) {
			if(lampioni.get(i).getSifra() == l.getSifra()) {
				return false;
			}
		}
		return lampioni.add(l);
	}
	public Lampion pronadji(double c , String b) {
		for(int i = 0 ; i < lampioni.size(); i ++) {
			if(lampioni.get(i).getCena() > c && lampioni.get(i).getBoja().equals(b)) {
				return lampioni.get(i);
			}
		}
		return null;
	}
	
	public boolean postaviAkciju() {
		if(lampioni.isEmpty()) {
			return false;
		}
		
		System.out.println("Molimo Vas unesite akcijsku cenu:");
		String cenaString;
		
		Scanner in = new Scanner(System.in);
		cenaString = in.nextLine();
		
		in.close();
		
		try {
			int novaCena = Integer.parseInt(cenaString);
			
			Lampion najskuplji = lampioni.get(0);
			for(int i = 1 ; i < lampioni.size(); i++) {
				if(lampioni.get(i).getCena() > najskuplji.getCena()) {
					najskuplji = lampioni.get(i);
				}
			}
			if(novaCena > najskuplji.getCena()) {
				najskuplji.setCena(novaCena);
				return true;
			}
			return false;
			
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
		
		
	
	@Override
	public String toString() {
		String s = "NOVOGODISNJA RASVETA\n*****************************\n";
		if(lampioni.isEmpty()) {
			return "Prazna lista";
		}
		for(int i = 0 ; i < lampioni.size(); i++) {
			s += lampioni.get(i);
			s += "\n";
		}
		
		s += "*****************************";
		
		return s;
	}
	
	
	
}
