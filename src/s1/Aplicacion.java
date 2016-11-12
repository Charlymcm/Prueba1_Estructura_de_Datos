package s1;

public class Aplicacion {

	public static void main(String[] args) {
		
		//Punto p = new Punto();
		//p.setX(2);
		//System.out.println("La coordenada x es: " +p.getX());
		//p.toString();
		//System.out.println(p);
		
		Circulo circulo = new Circulo();
		System.out.println(circulo.calcularArea());
		
		Triangulo triangulo = new Triangulo();
		System.out.println(triangulo.calcularArea());

		Cuadrado cuadrado = new Cuadrado();
		System.out.println(cuadrado.calcularArea());

		Rectangulo rectangulo = new Rectangulo();
		System.out.println(rectangulo.calcularArea());
		
	}

}
