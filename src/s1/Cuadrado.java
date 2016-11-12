package s1;

public class Cuadrado implements FiguraGeometrica{
	private double lado;
    private double areaCuadrado;

    public Cuadrado() 
    {
        lado = 20;
    }

    public double getBase() 
    {
        return lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado;
    }

    public double getAreaCuadrado() 
    {
        return areaCuadrado;
    }

    public String toString() {
		return "base: "+this.lado;
	}
    
    public double calcularArea() 
    {
        return areaCuadrado = lado * lado;
    }

}
