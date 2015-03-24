abstract class Figura implements FiguraColorida{
	private String tipo,cor=null;
	private float x,y;
	
	void setTipo(String tipo){
		this.tipo = tipo;
	}
	public String getTipo(){
		return tipo;
	}
	
	void setCor(String cor){
		this.cor = cor;
	}
	public String getCor(){
		return cor;
	}
	
	@Override
	public String toString(){
		return tipo;
	}
	
	void setX(float x){
		this.x = x;
	}
	
	float getX(){
		return x;
	}
	
	void setY(float y){
		this.y = y;
	}
	
	float getY(){
		return y;
	}
	
	public void desenhar(){
		System.out.println(getTipo());
	
	}
	
	public void desenhar(String cor){
		setCor(cor);
		System.out.println(getTipo()+" "+getCor());
	
	}
	void mover(float dX,float dY){
		this.x = this.x+dX;
		this.y = this.y+dY;
	}
	abstract float calculaArea();
}
