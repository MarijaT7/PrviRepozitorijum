package novogodisnjaRasveta;

public class Lampion implements Popravka {

	private int sifra;
	private String boja;
	private boolean ispravan;
	private double cena;
	
	public Lampion(int sifra, String boja, boolean ispravan, double cena) {
		super();
		this.sifra = sifra;
		this.boja = boja;
		this.ispravan = ispravan;
		this.cena = cena;
	}
	public Lampion(Lampion l) {
		this.sifra = l.sifra;
		this.boja = l.boja;
		this.ispravan = l.ispravan;
		this.cena = l.cena;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	public boolean isIspravan() {
		return ispravan;
	}
	public void setIspravan(boolean ispravan) {
		this.ispravan = ispravan;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	@Override
	public boolean popravi() {
		if(!ispravan) {
			ispravan = true;
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		String s = "------ Lampion --------\n";
		s += "Sifra = ";
		s += sifra;
		s += "\nBoja = " + boja;
		s += "\nIspravan = ";
		s += (ispravan) ? "Ispravan" : "Nije ispravan";
		s += "\nCena = " + cena;
		s += "\n--------------------------" ;
		
		return s;
	}
}
