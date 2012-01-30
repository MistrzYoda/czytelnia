package czytelnia;

import java.util.HashMap;
import java.util.Map;

import CzytelniaExceptions.CmojWyjatek;

public class Cbiblioteka {
	public Cczytelnicy Czytelnicy;
	public Cksiazki Ksiazki;
	private Map<Cczytelnik,Cegzemplarz> lista;
	
	public Cbiblioteka() {
		this.lista = new HashMap<Cczytelnik,Cegzemplarz>();
		this.Czytelnicy = new Cczytelnicy();
		this.Ksiazki = new Cksiazki();
	}

	/*
	 *  wypo¿yczenie ksi¹¿ki z biblioteki - metoda zwraca wypo¿yczony przez czytelnika egzemplarz ksi¹¿ki
	 */
	public Cegzemplarz WypozyczenieKsiazki(Cczytelnik c,Cksiazka k) {
		Cegzemplarz e = null;

		try {
			e = this.Ksiazki.PobierzKsiazke(k).Egzemplarze.PobierzWolny();
			
			this.lista.put(c, e);
			e.setWypozyczony(true);
		}
		catch(Exception ex) {
			if (ex instanceof CmojWyjatek) {
				System.out.println( ex.getMessage() );
			}
		}
		
		return e;
	}
	
	/*
	 * zwrócenie ksi¹¿ki przez czytelnika
	 */
	public void ZwrotKsi¹¿ki(Cczytelnik c, Cegzemplarz e)  {
		e.setWypozyczony(false);
	}
	
	public String StanBiblioteki() {
		String s = "Stan biblioteki: \n\n";
		
		// czytelnicy
		s = s + "Czytelnicy: \n"+this.Czytelnicy +"\n\n";
		
		// ksiazki
		s = s + "Ksi¹¿ki: \n"+this.Ksiazki +"\n\n";
		
		return s;
	}

}
