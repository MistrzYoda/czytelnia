package czytelnia;

import java.util.Calendar;

import CzytelniaExceptions.CniewlasciwaDataException;

public class Cczytelnik extends Cosoba{
	//private static int Numer = 0; 
	private Calendar DataZapisania;
	
	public Cczytelnik() {
		super();
	}
	
	public Cczytelnik(String Imie, String Nazwisko, Calendar DataUrodzenia, Calendar DataZapisania) throws CniewlasciwaDataException  {	
		super(Imie,Nazwisko,DataUrodzenia);
		this.setDataZapisania(DataZapisania);
		//this.Numer = ++this.Numer;
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
	public void setDataZapisania(Calendar dataZapisania) throws CniewlasciwaDataException  {
		if ( this.getDataUrodzenia().after(dataZapisania) )
			throw new CniewlasciwaDataException("Data zapisania nie mo¿e byæ póŸniejsza ni¿ data urodzenia czytelnika!");
		else
			DataZapisania = dataZapisania;
	}
	
/*

	public int getNumer() {
		return Numer;
	}
*/
	public String toString() {
		//return "Numer: "+this.getNumer()+"\nDane osobowe czytelnika: "+this.getImie()+" "+this.getNazwisko()+", ur."+this.getDataUrodzenia().get(Calendar.YEAR)+"/"+(this.getDataUrodzenia().get(Calendar.MONTH)+1)+"/"+this.getDataUrodzenia().get(Calendar.DAY_OF_MONTH)+". Data zapisania: "+this.getDataZapisania().get(Calendar.YEAR)+"/"+(this.getDataZapisania().get(Calendar.MONTH)+1)+"/"+this.getDataZapisania().get(Calendar.DAY_OF_MONTH);
		return "Dane osobowe czytelnika: "+this.getImie()+" "+this.getNazwisko()+", ur."+this.getDataUrodzenia().get(Calendar.YEAR)+"/"+(this.getDataUrodzenia().get(Calendar.MONTH)+1)+"/"+this.getDataUrodzenia().get(Calendar.DAY_OF_MONTH)+". Data zapisania: "+this.getDataZapisania().get(Calendar.YEAR)+"/"+(this.getDataZapisania().get(Calendar.MONTH)+1)+"/"+this.getDataZapisania().get(Calendar.DAY_OF_MONTH);
	}
}
