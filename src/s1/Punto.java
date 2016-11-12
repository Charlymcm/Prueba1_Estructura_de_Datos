package s1;

public class Punto {

	private int x;
	private int y;

	public Punto(){
		x = 1;
		y = 2;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "x: "+this.x +"\ty: "+this.y;
	}
	
}

//atributos
//constructores
//no pedir datos por teclado o imprimir en ventanas en las clases (solo en la aplicacion)
