package czytelnia;

import java.util.Calendar;

import CzytelniaExceptions.CmojWyjatek;

public class Cosoba {
	private String Imie;
	private String Nazwisko;
	private Ckalendarz DataUrodzenia;
	
	public Cosoba() {
		
	}
	
	public Cosoba(String i, String n, Ckalendarz d) throws CmojWyjatek {
		Calendar obecnaData = Calendar.getInstance();
		if (d.getCalendar().after(obecnaData))
				throw new CmojWyjatek("Data urodzenia nie mo¿e byæ póŸniejsza ni¿ data dzisiejsza! Obiekt nie zosta³ utworzony.");
		else {
			this.setImie(i);
			this.setNazwisko(n);		
			this.setDataUrodzenia(d);
		}
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
	
	/**
	 * @return the dataUrodzenia
	 */
	public Ckalendarz getDataUrodzenia() {
		return DataUrodzenia;
	}

	/**
	 * @param dataUrodzenia the dataUrodzenia to set
	 */
	public void setDataUrodzenia(Ckalendarz dataUrodzenia) {
		DataUrodzenia = dataUrodzenia;
	}

	public String toString() {
		return this.getImie()+" "+this.getNazwisko()+", data ur. "+this.getDataUrodzenia().PobierzDate();
	}
	
}
