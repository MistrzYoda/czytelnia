package czytelnia;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import CzytelniaExceptions.CmojWyjatek;


public class Cezgemplarze {
	private List<Cegzemplarz> lista;
	
	public Cezgemplarze() {
		this.lista = new ArrayList<Cegzemplarz>();
	}
	
	public void DodajEgzemplarz(Cegzemplarz e) {
		this.lista.add(e);
	}
	
	public void UsunEgzemplarz(int i) {
		this.lista.remove(i);
	}
	
	public void UsunEzgemplarz(Cegzemplarz e) {
		int przed = this.lista.size();
		int po = 0;
		
		while ( this.lista.contains(e) ) {
			this.lista.remove(e);
		}
		po = this.lista.size();
		
		if (po<przed)
			System.out.println("Usuniêto "+(przed-po)+" egzeplarzy!");
		else
			System.out.println("Nie usuniêto ¿adnego egzemplarza!");
	}
	
	public void UsunWszystkieEgzemplarze() {
		this.lista.clear();
	}
	
	public boolean CzyWypozyczony(int index) {
		return this.lista.get(index).isWypozyczony();
	}
	
	public boolean CzyWypozyczony(Cegzemplarz e) {
		Iterator<Cegzemplarz> it = this.lista.iterator();
		Cegzemplarz i = null;
		
		while (it.hasNext()) {
			i = it.next();
			if ( i.equals(e) )
				break;
		}
		return i.isWypozyczony();
	}
	
	public Cegzemplarz PobierzWolny() throws CmojWyjatek {
		Iterator<Cegzemplarz> it = this.lista.iterator();
		Cegzemplarz i = null;
		Cegzemplarz out = null;
		
		while (it.hasNext()) {
			i = it.next();
			if ( !i.isWypozyczony() ) {
				out = i;			
				break;
			}
		}		
		
		if ( out==null )
			throw new CmojWyjatek("Brak wolnego egzemplarza!");
		
		return out;
	}
	
	public int LiczbaWolnych() {
		Iterator<Cegzemplarz> it = this.lista.iterator();
		int out = 0;
		Cegzemplarz i = null;
		
		while (it.hasNext()) {
			i = it.next();
			if ( !i.isWypozyczony() )
				out++;
		}
		return out;		
	}
	
	public int LiczbaZajetych() {
		return this.LiczbaEgzemplarzy() - this.LiczbaWolnych();	
	}	
	
	public int LiczbaEgzemplarzy() {
		return this.lista.size();
	}
	
}
