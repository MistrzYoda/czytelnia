package czytelnia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Cksiazki {
	private List<Cksiazka> lista;
	
	public Cksiazki() {
		this.lista = new ArrayList<Cksiazka>();
	}
	
	public Cksiazka Dodaj(Cksiazka k) {
		this.lista.add(k);
		return k;
	}
	
	public void Usun(Cksiazka k) {
		this.lista.remove(k);
	}
	
	public void Usun(int index) {
		this.lista.remove(index);
	}
	
	public void UsunWszystkie() {
		this.lista.clear();
	}
	
	public Cksiazka PobierzKsiazke(int index) {
		return this.lista.get(index);
	}
	
	public Cksiazka PobierzKsiazke(Cksiazka k) {
		return this.PobierzKsiazke( this.lista.indexOf(k) );
	}
	
	public String OpisKsiazek() {
		String s = "Ksia¿ki w bibliotece: \n";
		Iterator<Cksiazka> it = this.lista.iterator();
		Cksiazka k = null;
		int index = 1;
		int LiczbaKsiazek = 0;
		
		while(it.hasNext()) {
			k = it.next();
			s = s + "[" + index + "] "+k+"\n\n";
			LiczbaKsiazek = LiczbaKsiazek + k.Egzemplarze.LiczbaEgzemplarzy();
			index++;
		}
		
		s = s + "\n\nCa³kowita liczba tytu³ów: "+this.lista.size();
		s = s + "\n\nCa³kowita liczba ksi¹¿ek: "+LiczbaKsiazek;
		
		return s;
	}
	
	public String toString() {
		return this.OpisKsiazek();
	}

	

}
