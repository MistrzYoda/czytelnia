package czytelnia;

public class Cwypozyczenie {
	private Cczytelnik Czytelnik;
	private Cegzemplarz Egzemplarz;
	private Ckalendarz DataWypozyczenia;
	private Ckalendarz DataZwrotu;
	
	public Cwypozyczenie() {
		
	}
	
	public Cwypozyczenie(Cczytelnik c, Cegzemplarz e) {
		this.setCzytelnik(c);
		this.setEgzemplarz(e);
		// ustawia bie¿¹c¹ datê jako datê wypo¿yczenia
		this.setDataWypozyczenia(new Ckalendarz() );
		this.setDataZwrotu(null);
	}
	
	/**
	 * @return the czytelnik
	 */
	public Cczytelnik getCzytelnik() {
		return Czytelnik;
	}
	/**
	 * @param czytelnik the czytelnik to set
	 */
	public void setCzytelnik(Cczytelnik czytelnik) {
		Czytelnik = czytelnik;
	}
	/**
	 * @return the egzemplarz
	 */
	public Cegzemplarz getEgzemplarz() {
		return Egzemplarz;
	}
	/**
	 * @param egzemplarz the egzemplarz to set
	 */
	public void setEgzemplarz(Cegzemplarz egzemplarz) {
		Egzemplarz = egzemplarz;
	}
	/**
	 * @return the dataWypozyczenia
	 */
	public Ckalendarz getDataWypozyczenia() {
		return DataWypozyczenia;
	}
	/**
	 * @param dataWypozyczenia the dataWypozyczenia to set
	 */
	public void setDataWypozyczenia(Ckalendarz dataWypozyczenia) {
		DataWypozyczenia = dataWypozyczenia;
	}
	/**
	 * @return the dataZwrotu
	 */
	public Ckalendarz getDataZwrotu() {
		return DataZwrotu;
	}
	/**
	 * @param dataZwrotu the dataZwrotu to set
	 */
	public void setDataZwrotu(Ckalendarz dataZwrotu) {
		
		this.DataZwrotu = dataZwrotu;
	}
	
	public String Opis() {
		return this.getCzytelnik()+ " po¿yczy³ "+this.getEgzemplarz()+" dnia "+this.getDataWypozyczenia().PobierzDateCzas()+", a odda³ go "+this.getDataZwrotu().PobierzDateCzas();
	}
	
	public void Zwrot() {
		this.setDataZwrotu( new Ckalendarz() );
		this.getEgzemplarz().setWypozyczony(false);
		System.out.println( this.Opis() );
	}
}
