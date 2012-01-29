package czytelnia;

import java.util.Calendar;


public class czytelnia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar dataUrodzenia = Calendar.getInstance();
		Calendar dataZapisania = Calendar.getInstance();
		Cczytelnik c1 = new Cczytelnik();
		Cczytelnik c2 = new Cczytelnik();
		Cczytelnik c3 = null;
		try {
			dataUrodzenia.set(1984,Calendar.MAY,16);
			dataZapisania.set(2001, Calendar.APRIL,20);
			
			c3 = new Cczytelnik( new Cosoba("Andrzej","Lisowski",dataUrodzenia),dataZapisania );
		}
		catch (Exception e) {
			if (e instanceof CniewlasciwaDataException) {
				System.out.println(e.getMessage());
			}
			else {
				System.out.println("Nieokreœlony b³¹d!");
				System.out.println();
				e.printStackTrace();
			}
		}
		System.out.println("Czytelnik: \n"+c3);

	}

}
