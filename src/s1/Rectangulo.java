package s1;

public class Rectangulo implements FiguraGeometrica {
	private double base;
    private double altura;
    private double areaRectangulo;

    public Rectangulo() 
    {
        base = 5;
        altura = 3;
    }

    public double getBase() 
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    public double getAreaRectangulo() 
    {
        return areaRectangulo;
    }

    public String toString() {
		return "base: "+this.base +"\naltura: "+this.altura;
	}
   
    public double calcularArea() 
    {
        return areaRectangulo = base * altura;
    }
	
}
