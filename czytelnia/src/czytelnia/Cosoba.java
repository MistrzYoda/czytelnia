package czytelnia;

import java.util.Calendar;

import CzytelniaExceptions.CniewlasciwaDataException;

public class Cosoba {
	private String Imie;
	private String Nazwisko;
	private Calendar DataUrodzenia;
	
	public Cosoba() {
		
	}
	
	public Cosoba(String i, String n, Calendar d) throws CniewlasciwaDataException {
		Calendar obecnaData = Calendar.getInstance();
		if (d.after(obecnaData))
				throw new CniewlasciwaDataException("Data urodzenia nie mo¿e byæ póŸniejsza ni¿ data dzisiejsza! Obiekt nie zosta³ utworzony.");
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
	public Calendar getDataUrodzenia() {
		return DataUrodzenia;
	}

	/**
	 * @param dataUrodzenia the dataUrodzenia to set
	 */
	public void setDataUrodzenia(Calendar dataUrodzenia) {
		DataUrodzenia = dataUrodzenia;
	}

	public String toString() {
		return this.getImie()+" "+this.getNazwisko()+", data ur. "+this.getDataUrodzenia().get(Calendar.YEAR)+"/"+(this.getDataUrodzenia().get(Calendar.MONTH)+1)+"/"+this.getDataUrodzenia().get(Calendar.DAY_OF_MONTH);
	}
	
}
