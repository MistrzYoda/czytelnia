package czytelnia;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import CzytelniaExceptions.CmojWyjatek;

public class Cczytelnicy {
	private List<Cczytelnik> lista;
	
	public Cczytelnicy() {
		this.lista = new ArrayList<Cczytelnik>();
	}

	public void DodajCzytelnika(Cczytelnik c) throws CmojWyjatek {
		if ( this.lista.contains(c) )
			throw new CmojWyjatek("Taki czytelnik juz istnieje!");
		else
			this.lista.add(c);
	}
	
	public void UsunCzytelnika(Cczytelnik c) {
		this.lista.remove(c);
	}
	
	public void UsunCzytelnika(int index) {
		this.lista.remove(index);
	}
	
	public void UsunWszystkichCzytelnikow() {
		this.lista.clear();
	}
	
	public Cczytelnik ZnajdzCzytelnika(int numer) {
		return this.lista.get( numer );
	}
	
	public Integer NumerCzytelnika(String Imie, String Nazwisko, Ckalendarz DataUrodzenia) {
		Iterator<Cczytelnik> it = this.lista.iterator();
		Cczytelnik c;
		Integer i = new Integer(-1);
		int index = 0;
		
		while (it.hasNext()) {
			c = it.next();
			if ( c.getImie().compareTo(Imie)==0 && c.getNazwisko().compareTo(Nazwisko)==0 && c.getDataUrodzenia().getCalendar().compareTo(DataUrodzenia.getCalendar())==0 )
				break;

			index++;			
		}
		i = Integer.valueOf( index );	
		
		return i;
	}
	
	public String ListaCzytelnikow() {
		String s = "Lista czytelników:\n";
		Iterator<Cczytelnik> it = this.lista.iterator();
		int index = 1;
		
		while(it.hasNext()) {
			s = s + "[" + index + "] "+ it.next() + "\n"; 
			index++;
		}
		
		return s;
	}
	
	public String toString() {
		return this.ListaCzytelnikow();
	}
}
