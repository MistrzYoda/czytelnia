package czytelnia;

import java.util.Calendar;

import CzytelniaExceptions.CmojWyjatek;

public class Cegzemplarz {
	private Ckalendarz DataWydania;
	private boolean Wypozyczony;
	private String Opis;
	
	public Cegzemplarz() {
		this.setWypozyczony(false);
	}
	
	public Cegzemplarz(Ckalendarz d) throws CmojWyjatek {	
		this.setDataWydania(d);
		this.setWypozyczony(false);
		this.setOpis("");
	}
	
	public Cegzemplarz(Ckalendarz d,String opis) throws CmojWyjatek {	
		this.setDataWydania(d);
		this.setOpis(opis);
		this.setWypozyczony(false);
	}	

	/**
	 * @return the dataWydania
	 */
	public Ckalendarz getDataWydania() {
		return DataWydania;
	}

	/**
	 * @param dataWydania the dataWydania to set
	 */
	public void setDataWydania(Ckalendarz dataWydania) throws CmojWyjatek {
		Calendar c = Calendar.getInstance();
		if (dataWydania.getCalendar().after(c))
			throw new CmojWyjatek("Data wydania tego egzemplarza nie mo¿e byæ póŸniejsza ni¿ dzisiejsza data!");
		else
			DataWydania = dataWydania;
	}

	/**
	 * @return the wypozyczony
	 */
	public boolean isWypozyczony() {
		return Wypozyczony;
	}

	/**
	 * @param wypozyczony the wypozyczony to set
	 */
	public void setWypozyczony(boolean wypozyczony) {
		Wypozyczony = wypozyczony;
	}
	
	public String toString() {
		return "Egzemplarz ksi¹¿ki "+this.getOpis()+", rok wydania: "+this.getDataWydania().PobierzDate();
	}

	/**
	 * @return the opis
	 */
	public String getOpis() {
		return Opis;
	}

	/**
	 * @param opis the opis to set
	 */
	public void setOpis(String opis) {
		Opis = opis;
	}
}
