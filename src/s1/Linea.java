package s1;

public class Linea implements FiguraGeometrica{
	private Punto p1;
	private Punto p2;
	
	public Linea(){
		p1 = new Punto();
		p2 = new Punto();
	}

	public Punto getP1() {
		return p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	
	public String toString() {
		return "base: "+this.p1 +"\naltura: "+this.p2;
	}


	public double calcularArea() {
		return 0;
	}
	
	
}
