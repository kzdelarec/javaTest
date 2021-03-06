package hr.java.vjezbe.entitet;

import java.util.Arrays;

/**
 * Predstavlja entitet mjerne postaje. Definirana je mjestom u kojem se nalazi,
 * geografskim tockama(koordinate) i senzorima za mjerenje.
 * 
 * @author Kristijan Zdelarec
 * @see hr.java.vjezbe.entitet.Mjesto
 * @see hr.java.vjezbe.entitet.GeografskaTocka
 * @see hr.java.vjezbe.entitet.Senzor
 *
 */
public class MjernaPostaja {

	private String naziv;
	private Mjesto mjesto;
	private GeografskaTocka geografskaTocka;
	private Senzor[] sviSenzori;

	/**
	 * Inicijalizira podatke o nazivu mjerne postaje, o mjestu u kojem se nalazi,
	 * njene koordinate i senzore za mjerenje koje sadrzi.
	 * 
	 * @param naziv
	 *            podatak o nazivu mjerne postaje
	 * @param mjesto
	 *            podatak o mjestu u kojem se nalazi mjerna postaja
	 * @param geografskaTocka
	 *            podatak o koordinatama mjerne postaje
	 * @param sviSenzori
	 *            polje senzora koje sadrzi mjerna postaja
	 */
	public MjernaPostaja(String naziv, Mjesto mjesto, GeografskaTocka geografskaTocka, Senzor[] sviSenzori) {
		super();
		this.naziv = naziv;
		this.mjesto = mjesto;
		this.geografskaTocka = geografskaTocka;
		this.sviSenzori = sviSenzori;
	}

	/**
	 * Dohvaca vrijednosti senzora.
	 * 
	 * @param i
	 *            iterator, predstavlja redni broj senzora iz polja
	 * @return vraca vrijednosti senzora u obliku stringa
	 */
	public String dohvatiSenzore(int i) {
		Arrays.sort(sviSenzori, (p1, p2) -> p1.getMjernaJedinica().compareTo(p2.getMjernaJedinica()));
		return sviSenzori[i].dohvatiVrijednost();
	}

	/**
	 * Dohvaca naziv mjerne postaje.
	 * 
	 * @return vraca podatak o nazivu mjerne postaje
	 */
	public String getNaziv() {
		return naziv;
	}

	/**
	 * Postavlja naziv mjerne postaje.
	 * 
	 * @param naziv
	 *            podatak o nazivu mjerne postaje.
	 */
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	/**
	 * Dohvaca mjesto u kojem se nalazi mjerna postaja.
	 * 
	 * @return vraca podatak o mjestu u kojem se nalazi mjerna postaja
	 */
	public Mjesto getMjesto() {
		return mjesto;
	}

	/**
	 * Potavlja podatke o mjestu u kojem se nalazi mjerna postaja.
	 * 
	 * @param mjesto
	 *            podatak o mjestu u kojem se nalazi mjerna postaja
	 */
	public void setMjesto(Mjesto mjesto) {
		this.mjesto = mjesto;
	}

	/**
	 * Dohvaca koordinate mjerne postaje.
	 * 
	 * @return vraca koordinate mjerne postaje
	 */
	public GeografskaTocka getGeografskaTocka() {
		return geografskaTocka;
	}

	/**
	 * Postavlja koordinate mjerne postaje.
	 * 
	 * @param geografskaTocka
	 *            podatak o koordinatama mjerne postaje
	 */
	public void setGeografskaTocka(GeografskaTocka geografskaTocka) {
		this.geografskaTocka = geografskaTocka;
	}

	/**
	 * Dohvac podatke o senzorima mjerne postaje.
	 * 
	 * @return vraca podatke o senzorima mjerne postaje.
	 */
	public Senzor[] getSviSenzori() {
		return sviSenzori;
	}

	/**
	 * Postavlja podatke o senzorima mjerne postaje.
	 * 
	 * @param sviSenzori
	 *            polje svih senzora mjenre postaje
	 */
	public void setSviSenzori(Senzor[] sviSenzori) {
		this.sviSenzori = sviSenzori;
	}

}
