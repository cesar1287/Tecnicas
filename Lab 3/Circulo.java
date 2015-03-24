public class Circulo extends Figura{
	private String tipo = "Circulo";
	private float raio,area;
	
	Circulo(float x,float y,float raio){
		setX(x);
		setY(y);
		setTipo(tipo);
		this.raio = raio;
	}
	
	float calculaArea() {
		area = (float)(Math.PI*(raio*raio));
		return area;
	}
}

