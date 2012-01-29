package czytelnia;

import java.util.Calendar;

public class Cczytelnik {
	private static int Numer = 0; 
	private Cosoba Dane;
	private Calendar DataZapisania;
	
	public Cczytelnik() {
		
	}
	
	public Cczytelnik(Cosoba o, Calendar d) throws CniewlasciwaDataException  {	
		
		if ( o.getDataUrodzenia().after(d) )
			throw new CniewlasciwaDataException("Data zapisania nie mo¿e byæ póŸniejsza ni¿ data urodzenia czytelnika! Nie utworzono obiektu!");
		else {
			this.setDane(o);
			this.setDataZapisania(d);
			this.Numer = ++this.Numer;
		}
	}
	
	public void setDane(Cosoba o) {
		this.Dane = o;
	}
	
	public Cosoba getDane() {
		return this.Dane;
	}

	/**
	 * @return the dataZapisania
	 */
	public Calendar getDataZapisania() {
		return DataZapisania;
	}

	/**
	 * @param dataZapisania the dataZapisania to set
	 */
	public void setDataZapisania(Calendar dataZapisania) {
		DataZapisania = dataZapisania;
	}

	/**
	 * @return the numer
	 */
	public int getNumer() {
		return Numer;
	}
	
	public String toString() {
		return "Numer: "+this.getNumer()+"\nDane osobowe czytelnika: "+this.getDane()+". Data zapisania: "+this.getDataZapisania().get(Calendar.YEAR)+"/"+(this.getDataZapisania().get(Calendar.MONTH)+1)+"/"+this.getDataZapisania().get(Calendar.DAY_OF_MONTH);
	}
}
