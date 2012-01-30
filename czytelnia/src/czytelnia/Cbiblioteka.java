package czytelnia;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import CzytelniaExceptions.CmojWyjatek;

public class Cbiblioteka {
	public Cczytelnicy Czytelnicy;
	public Cksiazki Ksiazki;
	private Set<Cwypozyczenie> lista;
	
	public Cbiblioteka() {
		this.lista = new HashSet<Cwypozyczenie>();
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
			
			this.lista.add( new Cwypozyczenie(c,e) );
			e.setWypozyczony(true);
			System.out.println("Czytelnik: "+c+" wypo¿yczy³ egzemplarz: "+e+" ksi¹¿ki: "+k);
		}
		catch(Exception ex) {
			System.out.println( ex.getMessage() );
		}		
		
		return e;
	}
	
	/*
	 * zwrócenie ksi¹¿ki przez czytelnika
	 */
	public void ZwrotKsi¹¿ki(Cczytelnik c, Cegzemplarz e)  {
		Cwypozyczenie w = null;
		boolean Znaleziono = false;
		Iterator<Cwypozyczenie> it = this.lista.iterator();
		while(it.hasNext()) {
			w = it.next();
			if ( w.getCzytelnik().equals(c) && w.getEgzemplarz().equals(e) ) {				
				//e.setWypozyczony(false);
				w.Zwrot();
				Znaleziono = true;
				break;
			}
		}
		if (!Znaleziono)
			System.out.println("Czytelnik "+c+" nie wypo¿yczy³ ksi¹¿ki "+e+"!");

	}
	
	public String StanBiblioteki() {
		String s = "Stan biblioteki: \n\n";
		
		// czytelnicy
		s = s + this.Czytelnicy +"\n\n";
		
		// ksiazki
		s = s +this.Ksiazki +"\n\n";
		
		return s;
	}
	
	public String toString() {
		return this.StanBiblioteki();
	}
	
	public String WypozyczoneKsiazki() {
		String s = "Aktualnie wypo¿yczone ksi¹¿ki:\n";
		Cwypozyczenie w = null;
		
		Iterator<Cwypozyczenie> it = this.lista.iterator();
		while(it.hasNext()) {
			w = it.next();
			if ( w.getDataZwrotu()==null )
				s = s + "\n" + w.getCzytelnik() + " "+ w.getEgzemplarz();
		}
		
		return s;
	}

}
