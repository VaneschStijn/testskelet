package be.pxl.demo;

public class Auto {
	private String merk;
	private String eigenaar;
	private double prijs;

	public Auto(String merk, String eigenaar, double prijs) {
		// TODO: implementeer deze constructor
		this.merk = merk;
		this.eigenaar = eigenaar;
		this.prijs = prijs;
	}

	public Auto(String merk, double prijs) {
		// TODO: implementeer deze constructor
		//ZELF - WERKEN NAAR DE CONSTRUCTOR MET DE MEESTE PARAMETERS TOE!!
		this(merk, "Onbekend", prijs);
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

	public String getEigenaar() {
		return eigenaar;
	}

	public void setEigenaar(String eigenaar) {
		this.eigenaar = eigenaar;
	}

	public void verhoogPrijs(int percent) {
		// TODO: implementeer deze methode
		prijs = prijs * (1 + (double) percent/100);
	}
}
