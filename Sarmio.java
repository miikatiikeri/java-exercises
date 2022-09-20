package fi.vamk.olioohjelmointi.harjoitus1;

public class Sarmio {
	public double leveys, korkeus, pituus;
	public static void main(String[] args) {
		Sarmio sarmio1 = new Sarmio();
		Sarmio sarmio2 = new Sarmio();
		
		sarmio1.leveys = 2;
		sarmio1.korkeus = 3;
		sarmio1.pituus = 4;
		
		//tilavuus(sarmio1.leveys,sarmio1.korkeus,sarmio1.pituus);
		System.out.println(sarmio1.tilavuus());
		
		sarmio2.leveys = 3;
		sarmio2.korkeus = 4;
		sarmio2.pituus = 5;
		System.out.println(sarmio2.tilavuus());
	}
	
	public double tilavuus() {
		double tulos = leveys*korkeus*pituus;
		//System.out.println(tulos);
		return tulos; //laske tilavuus nollan tilalle
	}

}