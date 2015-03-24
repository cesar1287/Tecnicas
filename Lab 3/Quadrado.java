public class Quadrado extends Figura{
	private String tipo = "Quadrado";
	private float lado,area;
	
	Quadrado(float x,float y,float lado){
		setX(x);
		setY(y);
		setTipo(tipo);
		this.lado = lado;
	}
	
	float calculaArea() {
		area = lado*lado;
		return area;
	}
}
