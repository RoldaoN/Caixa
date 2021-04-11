package feriadao;

public class classetroco {

	private double troco;
	private double troco2;
	private double n50, n20,n10,n5,n2,m1,m50,m25,m10,m5;
	
	public classetroco()
	{
		
	}
	
	public void troco(int n50, int n20, int n10, int n5, int n2, int m1, int m50, int m25, int m10, int m5,double troco,double troco2)
	{
		this.m1 = m1;
		this.m10 = m10;
		this.m25 = m25;
		this.m5 = m5;
		this.m50 = m50;
		this.n10 = n10;
		this.n2 = n2;
		this.n20 = n20;
		this.n5 = n5;
		this.n50 = n50;
		this.troco = troco;
		this.troco2 = troco2;
		
		
		this.n50 = (troco/50);
		this.n20 = ((troco-n50*50)/20);
		this.n10 = ((troco-n50*50-n20*20)/10);
		this.n5 = ((troco - n50*50-n20*20-n10*10)/5);
		this.n2 = ((troco - n50*50-n20*20-n10*10-n5*5)/2);
		this.m1 = ((troco - n50*50-n20*20-n10*10-n5*5-n2*2)/1);
		this.m50 = troco2/50;
		this.m25 = ((troco2 - m50*50)/25);
		this.m10 = ((troco2 - m50*50-m25*25)/10);
		this.m5 = ((troco2 - m50*50-m25*25-m10*10)/5);	
	}
	

	public double getTroco() {
		return troco;
	}

	public void setTroco(double troco) {
		this.troco = troco;
	}

	public double getTroco2() {
		return troco2;
	}

	public void setTroco2(double troco2) {
		this.troco2 = troco2;
	}

	public double getN50() {
		return n50;
	}

	public void setN50(double n50) {
		this.n50 = n50;
	}

	public double getN20() {
		return n20;
	}

	public void setN20(double n20) {
		this.n20 = n20;
	}

	public double getN10() {
		return n10;
	}

	public void setN10(double n10) {
		this.n10 = n10;
	}

	public double getN5() {
		return n5;
	}

	public void setN5(double n5) {
		this.n5 = n5;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getM1() {
		return m1;
	}

	public void setM1(double m1) {
		this.m1 = m1;
	}

	public double getM50() {
		return m50;
	}

	public void setM50(double m50) {
		this.m50 = m50;
	}

	public double getM25() {
		return m25;
	}

	public void setM25(double m25) {
		this.m25 = m25;
	}

	public double getM10() {
		return m10;
	}

	public void setM10(double m10) {
		this.m10 = m10;
	}

	public double getM5() {
		return m5;
	}

	public void setM5(double m5) {
		this.m5 = m5;
	}
	
	
}
