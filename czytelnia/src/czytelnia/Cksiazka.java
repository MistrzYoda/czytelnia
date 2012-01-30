package czytelnia;

import CzytelniaExceptions.CmojWyjatek;


public class Cksiazka {
	private String Tytul;
	private String ImieAutora;
	private String NazwiskoAutora;
	private int ISBN;
	public Cezgemplarze Egzemplarze;
	
	public Cksiazka() {
		this.Egzemplarze = new Cezgemplarze();
	}
	
	public Cksiazka(String t, String i, String n, int isbn) throws CmojWyjatek {
		this.setImieAutora(i);
		this.setNazwiskoAutora(n);
		this.setTytul(t);
		this.setISBN(isbn);		
		this.Egzemplarze = new Cezgemplarze();
	}
	/**
	 * @return the tytul
	 */
	public String getTytul() {
		return Tytul;
	}
	/**
	 * @param tytul the tytul to set
	 */
	public void setTytul(String tytul) {
		Tytul = tytul;
	}
	/**
	 * @return the imieAutora
	 */
	public String getImieAutora() {
		return ImieAutora;
	}
	/**
	 * @param imieAutora the imieAutora to set
	 */
	public void setImieAutora(String imieAutora) {
		ImieAutora = imieAutora;
	}
	/**
	 * @return the nazwiskoAutora
	 */
	public String getNazwiskoAutora() {
		return NazwiskoAutora;
	}
	/**
	 * @param nazwiskoAutora the nazwiskoAutora to set
	 */
	public void setNazwiskoAutora(String nazwiskoAutora) {
		NazwiskoAutora = nazwiskoAutora;
	}
	/**
	 * @return the iSBN
	 */
	public int getISBN() {
		return ISBN;
	}
	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(int iSBN) throws CmojWyjatek {
		if (iSBN<0)
			throw new CmojWyjatek(this.getTytul()+" - niepoprawny ISBN (<0))!");
		else
			ISBN = iSBN;		
	}
	
	public String toString() {
		return this.getTytul()+" (ISBN="+this.getISBN()+") - "+this.getImieAutora()+" "+this.getNazwiskoAutora() + "\nWypo¿yczone egzemplarze: "+this.Egzemplarze.LiczbaZajetych()+"\nWolne egzemplarze: "+this.Egzemplarze.LiczbaWolnych();
		
	}
	
	public String Opis() {
		return this.getTytul()+" - "+this.getImieAutora()+" "+this.getNazwiskoAutora();
	}

}
