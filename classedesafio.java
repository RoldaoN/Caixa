package feriadao;

public class classedesafio {

	private double  total; 
	private int cincc,dezc,vintec,cinqc,dois,cinco,dez,vinte,cinq,cem,duz,um;
	
	public classedesafio(int cincc,int dezc,int vintec,int quinqc, int dois,int cinco,int dez, int vinte,int cinq,int cem,int duz, int um)
	{
		this.cem = cem;
		this.cincc = cincc;
		this.cinco = cinco;
		this.cinq=cinq;
		this.dez = dez;
		this.dezc = dezc;
		this.dois = dois;
		this.duz = duz;
		this.um = um;
		this.vinte = vinte;
		this.vintec = vintec;	
	}
	
	public double total ()
	{
		this.cem = cem;
		this.cincc = cincc;
		this.cinco = cinco;
		this.cinq=cinq;
		this.dez = dez;
		this.dezc = dezc;
		this.dois = dois;
		this.duz = duz;
		this.um = um;
		this.vinte = vinte;
		this.vintec = vintec;	
		
		double cent5 = cincc * 0.5;
		double cent10 = dezc *0.10;
		double cent25 = vintec * 0.25;
		double cent50 = cinqc * 0.50;
		double d2 = dois * 2;
		double c5 = cinco * 5;
		double d10 = dez * 10;
		double v20 = vinte * 20;
		double c50 = cinq * 50;
		double c100 = cem * 100;
		double d200 = duz * 200;
		
		return total = cent5+cent10+cent25+cent50+um+d2+c5+d10+v20+c50+c100+d200;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getCincc() {
		return cincc;
	}

	public void setCincc(int cincc) {
		this.cincc = cincc;
	}

	public int getDezc() {
		return dezc;
	}

	public void setDezc(int dezc) {
		this.dezc = dezc;
	}

	public int getVintec() {
		return vintec;
	}

	public void setVintec(int vintec) {
		this.vintec = vintec;
	}

	public int getCinqc() {
		return cinqc;
	}

	public void setCinqc(int cinqc) {
		this.cinqc = cinqc;
	}

	public int getDois() {
		return dois;
	}

	public void setDois(int dois) {
		this.dois = dois;
	}

	public int getCinco() {
		return cinco;
	}

	public void setCinco(int cinco) {
		this.cinco = cinco;
	}

	public int getDez() {
		return dez;
	}

	public void setDez(int dez) {
		this.dez = dez;
	}

	public int getVinte() {
		return vinte;
	}

	public void setVinte(int vinte) {
		this.vinte = vinte;
	}

	public int getCinq() {
		return cinq;
	}

	public void setCinq(int cinq) {
		this.cinq = cinq;
	}

	public int getCem() {
		return cem;
	}

	public void setCem(int cem) {
		this.cem = cem;
	}

	public int getDuz() {
		return duz;
	}

	public void setDuz(int duz) {
		this.duz = duz;
	}

	public int getUm() {
		return um;
	}

	public void setUm(int um) {
		this.um = um;
	}
	
}
