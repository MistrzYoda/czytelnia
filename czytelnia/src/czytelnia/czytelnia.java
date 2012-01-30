package czytelnia;

import java.util.Calendar;


public class czytelnia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		
		Cbiblioteka b = new Cbiblioteka();
		
		Cczytelnik c1 = null, c2 = null, c3 = null,c4 = null;
		Cksiazka k1 = null, k2 = null;
		try {
			c1 = new Cczytelnik("Roman","Pi³ka",new Ckalendarz(1984,Calendar.MAY,16) , new Ckalendarz(2011,Calendar.JULY,11) );
			c2 = new Cczytelnik("Bart³omiej","G¹bka",new Ckalendarz(1956,Calendar.DECEMBER,8) , new Ckalendarz(2000,Calendar.JANUARY,1) );
			c3 = new Cczytelnik("Micha³","Wo³odyjowski",new Ckalendarz(1650,Calendar.JUNE,30) , new Ckalendarz(1660,Calendar.MARCH,29) );
			c4 = new Cczytelnik("Gandalf","Szary",new Ckalendarz(1234,Calendar.AUGUST,13) , new Ckalendarz(1830,Calendar.MARCH,2) );
			
			// dodanie czytelników
			b.Czytelnicy.DodajCzytelnika(c1);
			b.Czytelnicy.DodajCzytelnika(c2);
			b.Czytelnicy.DodajCzytelnika( new Cczytelnik("Adam","Ma³ysz",new Ckalendarz(1970,Calendar.NOVEMBER,15), new Ckalendarz(1985,Calendar.APRIL,5)) );
			b.Czytelnicy.DodajCzytelnika(c3);
			b.Czytelnicy.DodajCzytelnika(c4);
			
			//dodanie ksi¹¿ek
			k1 = new Cksiazka("Medaliony","Zofia","Na³kowska",112233);
			k1.Egzemplarze.DodajEgzemplarz( new Cegzemplarz(new Ckalendarz(2010,Calendar.MARCH,27),k1.Opis()) );
			k1.Egzemplarze.DodajEgzemplarz( new Cegzemplarz(new Ckalendarz(2010,Calendar.MARCH,27),k1.Opis()) );
			k1.Egzemplarze.DodajEgzemplarz( new Cegzemplarz(new Ckalendarz(2011,Calendar.MAY,7),k1.Opis()) );
			b.Ksiazki.Dodaj(k1);
			
			b.Ksiazki.Dodaj( new Cksiazka("Gringo w krainie dzikich plemion","Wojciech","Cejrowski",121212) );
			k2 = b.Ksiazki.Dodaj( new Cksiazka("Flags of our fathers","James","Bradley",44456765)  );
			
			b.Ksiazki.PobierzKsiazke(1).Egzemplarze.DodajEgzemplarz( new Cegzemplarz(new Ckalendarz(2008,Calendar.JANUARY,5),b.Ksiazki.PobierzKsiazke(1).Opis()) );
			b.Ksiazki.PobierzKsiazke(1).Egzemplarze.DodajEgzemplarz( new Cegzemplarz(new Ckalendarz(2008,Calendar.JANUARY,10),b.Ksiazki.PobierzKsiazke(1).Opis()) );
			b.Ksiazki.PobierzKsiazke(1).Egzemplarze.DodajEgzemplarz( new Cegzemplarz(new Ckalendarz(2008,Calendar.JANUARY,15),b.Ksiazki.PobierzKsiazke(1).Opis()) );
			b.Ksiazki.PobierzKsiazke(1).Egzemplarze.DodajEgzemplarz( new Cegzemplarz(new Ckalendarz(2008,Calendar.JANUARY,25),b.Ksiazki.PobierzKsiazke(1).Opis()) );
			
			b.Ksiazki.PobierzKsiazke( k1 ).Egzemplarze.DodajEgzemplarz( new Cegzemplarz(new Ckalendarz(2000,Calendar.FEBRUARY,6),b.Ksiazki.PobierzKsiazke( k1 ).Opis()) );
			
			k2.Egzemplarze.DodajEgzemplarz(  new Cegzemplarz(new Ckalendarz(2009,Calendar.SEPTEMBER,16),k2.Opis()) );			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println(b);
		Cegzemplarz e1 = null, e2 = null, e3 = null;
		e1 = b.WypozyczenieKsiazki(c1, k1);
		
		b.WypozyczenieKsiazki(c1, k1);
		b.WypozyczenieKsiazki(c2, k1);
		e2 = b.WypozyczenieKsiazki(c2, k2);
		System.out.println();
		e3 = b.WypozyczenieKsiazki(c3, b.Ksiazki.PobierzKsiazke(1) );
		System.out.println();
		System.out.println(b);
		b.ZwrotKsi¹¿ki(c1, e1 );
		System.out.println(b);
		
		System.out.println(b.WypozyczoneKsiazki());
		System.out.println();
		b.ZwrotKsi¹¿ki(c1, e3);
	}

}
