package fi.vamk.olioohjelmointi.harjoitus1;

import java.util.Scanner;

public class Harjoitus1a {

	public static void main(String[] args) {
		//toteuta Scannerilla kahden numeron kysely
		
		Scanner input = new Scanner(System.in);
		//int pienin, suurin;
		
		System.out.println("anna ensimm�inen luku: ");
		int a = input.nextInt();
		
		System.out.println("anna toinen luku: ");
		int b = input.nextInt();
		
		//System.out.println(a + " " + b);
		/*
		if (a > b) {
			suurin = a;
			pienin = b;
		} else {
			pienin = a;
			suurin = b;
		}
		*/
		
		//pyydä tekemääsi metodia lajittelemaan ja palauttamaan välilyönnillä erotellut numerot
		String tulos = lajittelePieninEnsin(a,b);
		System.out.println(tulos);
	}
	
	//Metodi kirjoitettiin omakseen, jotta sitä pystyy testaamaan
	public static String lajittelePieninEnsin(int a, int b) {
		//muuta ohjemaa siten, että se tulostaa aina pienimmän ensin, käytä esim if(a<b)
		int pienin, suurin;
		
		if (a > b) {
			suurin = a;
			pienin = b;
		} else {
			pienin = a;
			suurin = b;
		}
		
		return pienin +" "+suurin;
	}

}
