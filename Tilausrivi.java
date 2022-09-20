package fi.vamk.olioohjelmointi.harjoitus1;

public class Tilausrivi {
	private String nimi;
	private int maara;
	private double hinta;
	
	public static void main(String[] args) {
		Tilausrivi tilaus1 = new Tilausrivi();
		Tilausrivi tilaus2 = new Tilausrivi();
		
		tilaus1.setNimi("Reppu");
		tilaus1.setMaara(4);
		tilaus1.setHinta(10.5);
		
		
		System.out.println(tilaus1.hintaYhteensa());
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String tuote) {
		this.nimi = tuote;
	}

	public int getMaara() {
		return maara;
	}

	public void setMaara(int maara) {
		this.maara = maara;
	}
	
	public double hintaYhteensa() {
		double tulos;
		tulos = maara * hinta;
		return tulos;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
}
