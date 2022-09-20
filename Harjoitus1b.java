package fi.vamk.olioohjelmointi.harjoitus1;

import java.util.Scanner;

public class Harjoitus1b {
	private static String[] sanat ;
	public static void main(String[] args) {
		// kysy taulukon koko käyttäen Scanner -luokkaa ja System.in ja kutsu taulukon koon alustamista oikealla maarällä
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("kuinka monta nime� aiot sy�tt��?");
		int a = input.nextInt();
		alustaTaulukko(a);
		
		System.out.println("sy�t� nimet");
		
		for(int i=0; i < a; i++) {
			
			String sana = input.next();
			lisaaTaulukkoon(i,sana);

			//sanat[i] = sana;
		}
		//alustaTaulukko(a);
		//kysy käyttäjältä haluttu määrä sanoja Scanner -oliolal ja kutsu lisaaTaulukkoom, lisätäksesi ne
		//käytä vaikka for-silmukkaa

		
		//lopuksi tulosta
		System.out.println(tulostaTaulukko());
	}
	
	public static void alustaTaulukko(int luku) {
		sanat =new String[luku];
	}
	
	public static void lisaaTaulukkoon(int paikka, String sana) {
		//Lisää taulukkoon oikeaan paikkaa oikea sana
		sanat[paikka] = sana;
	}
	
	public static String tulostaTaulukko() {
		String tulos="";
		//tulosta taulukon kaikki sanat kukin omalle rivilleen
		//käytä \n rivinvaihtona ilman erillisiä välilyöntejä
		//käytä vaikka for:ia päivittääksesi tulokseen sanat -taulukon sanat
		
		for (int i=0; i<sanat.length;i++) {
			System.out.println(sanat[i]);
			tulos += sanat[i]+"\n";
		}
		//System.out.println(tulos);
		
		return tulos;
	}

}
