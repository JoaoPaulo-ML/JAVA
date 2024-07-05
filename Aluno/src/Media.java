
public class Media {
	
	public double a;
	public double b;
	public double c;
	public double d;
	public String nome;

	public Media(double a, double b, double c, double d, String nome) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.nome = nome;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double calculo() {
		double media = (this.a + this.b + this.c + this.d) / 4.0;
		return media;
	}
	
}
