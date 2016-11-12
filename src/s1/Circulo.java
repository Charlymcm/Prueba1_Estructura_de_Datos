package s1;

public class Circulo implements FiguraGeometrica{

	private Punto centro;
	private double radio;
	private double areaRadio;
	static final double pi = 3.1415;
	
	public Circulo(){				//constructor por defecto
		centro = new Punto();
		radio = 1;
	}
	
	public Circulo(Punto c, double r){				// constructor con parametros
		centro = c;
		radio = r;
	}
	

	public Punto getCentro() {
		return centro;
	}

	public double getRadio() {
		return radio;
	}

	public double getAreaRadio() {
		return areaRadio;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public void setAreaRadio(double areaRadio) {
		this.areaRadio = areaRadio;
	}

	public String toString() {
		return "centro: "+this.centro +"\nradio: "+this.radio;
	}
	
	public double calcularArea() 
    {
        return areaRadio = pi * radio * radio;
    } 
	
}
