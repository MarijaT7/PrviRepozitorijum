package novogodisnjiPaketic;

public class NovogodisnjiPaketic extends Pakovanje {

	private String opis;
	private String namenjen;
	private boolean spakovan;
	private int minimalanUzrast;
	private boolean zasluzen;
	private boolean spremanZaIsporuku;
	
	public NovogodisnjiPaketic(String opis, String namenjen, boolean spakovan, int minimalanUzrast, boolean zasluzen,
			boolean spremanZaIsporuku) {
		super();
		this.opis = opis;
		this.namenjen = namenjen;
		this.spakovan = spakovan;
		this.minimalanUzrast = minimalanUzrast;
		this.zasluzen = zasluzen;
		this.spremanZaIsporuku = spremanZaIsporuku;
	}
	
	public String getOpis() {
		return opis;
	}


	public void setOpis(String opis) {
		this.opis = opis;
	}


	public boolean isSpremanZaIsporuku() {
		return spremanZaIsporuku;
	}


	public void setSpremanZaIsporuku(boolean spremanZaIsporuku) {
		this.spremanZaIsporuku = spremanZaIsporuku;
	}


	public String getNamenjen() {
		return namenjen;
	}


	public boolean isSpakovan() {
		return spakovan;
	}


	public int getMinimalanUzrast() {
		return minimalanUzrast;
	}


	@Override
	public boolean spakuj() {
		if(!zasluzen || spakovan) {
			return false;
		}
		else if(namenjen.equals("za decaka") || namenjen.equals("za devojcicu")) {
			if(minimalanUzrast > 2) {
				spakovan = true;
				System.out.println("Novogodisnji paketic je uspesno spakovan");
				return true;
			}
			return false;
		}
		return false;
	}

	@Override
	public String toString() {
		String s = "NOVOGODISNJI PAKETIC\n";
		String i1 = (spakovan)? "Spakovan":"Nije spakovan";
		String i2 = (zasluzen)? "Zasluzen":"Nije zasluzen";
		String i3 = (spremanZaIsporuku)? "Spreman za isporuku":"Nije spreman za isporuku";
		
		s += "Opis = " + opis ;
		s += "\nNamenjen = " + namenjen;
		s += "\nSpakovan = " + i1;
		s += "\nMinimalan uzrast = " + minimalanUzrast;
		s += "\nZasluzen = " + i2;
		s += "\nSpreman za isporuku = " + i3 ;
		
		return s;
	}


}
