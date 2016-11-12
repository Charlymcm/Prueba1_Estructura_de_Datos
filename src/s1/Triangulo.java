package s1;

public class Triangulo implements FiguraGeometrica {
	
	private double base;
    private double altura;
    private double areaTriangulo;
    
    public Triangulo() 
    {
        base = 5;
        altura = 10;
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

    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }

    public String toString() {
		return "base: "+this.base +"\naltura: "+this.altura;
	}
 
    public double calcularArea() 
    {
        return areaTriangulo = (base * altura) / 2;
    }

}
