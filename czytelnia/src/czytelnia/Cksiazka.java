package czytelnia;

import CzytelniaExceptions.CniepoprawnyISBNException;

public class Cksiazka {
	private String Tytul;
	private String ImieAutora;
	private String NazwiskoAutora;
	private Integer ISBN;
	
	public Cksiazka() {
		
	}
	
	public Cksiazka(String t, String i, String n, Integer isbn) throws CniepoprawnyISBNException {
		this.setImieAutora(i);
		this.setNazwiskoAutora(n);
		this.setTytul(t);
		this.setISBN(isbn);			
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
	public Integer getISBN() {
		return ISBN;
	}
	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(Integer iSBN) throws CniepoprawnyISBNException {
		if (iSBN<0)
			throw new CniepoprawnyISBNException(this.getTytul()+" - niepoprawny ISBN (<0))!");
		else
			ISBN = iSBN;		
	}
}
