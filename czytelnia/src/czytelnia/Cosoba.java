package czytelnia;

public class Cosoba {
	private String Imie;
	private String Nazwisko;
	
	public Cosoba(String i, String n) {
		this.setImie(i);
		this.setNazwisko(n);
	}

	/**
	 * @return the imie
	 */
	public String getImie() {
		return Imie;
	}

	/**
	 * @param imie the imie to set
	 */
	public void setImie(String imie) {
		Imie = imie;
	}

	/**
	 * @return the nazwisko
	 */
	public String getNazwisko() {
		return Nazwisko;
	}

	/**
	 * @param nazwisko the nazwisko to set
	 */
	public void setNazwisko(String nazwisko) {
		Nazwisko = nazwisko;
	}
	
	public String toString() {
		return this.Imie+" "+this.Nazwisko;
	}
	
}
