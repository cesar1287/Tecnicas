import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		/*Quadrado q = new Quadrado(3, 4, 2);
		System.out.println(q.calculaArea());
		q.mover(2, 1);
		q.desenhar("Amarelo");
		Quadrado q1 = new Quadrado(3, 4, 2);
		System.out.println(q1.calculaArea());
		q1.mover(2, 1);
		q1.desenhar();*/
		ArrayList<Quadrado> vetor = new ArrayList<Quadrado>();
		Quadrado q1 = new Quadrado(1,2,3);
		q1.desenhar();
		Quadrado q2 = new Quadrado(2,2,1);
		q2.desenhar("branco");
		Quadrado q3 = new Quadrado(1,2,3);
		q3.desenhar();
		Quadrado q4 = new Quadrado(1,2,2);
		q4.desenhar("branco");
		Quadrado q5 = new Quadrado(1,2,3);
		q5.desenhar();
		Quadrado q6 = new Quadrado(1,2,3);
		q6.desenhar("branco");
		Quadrado q7 = new Quadrado(1,2,4);
		q7.desenhar("branco");
		Quadrado q8 = new Quadrado(1,2,3);
		q8.desenhar();
		Quadrado q9 = new Quadrado(1,2,5);
		q9.desenhar("branco");
		Quadrado q10 = new Quadrado(1,2,6);
		q10.desenhar("branco");
		vetor.add(q1);vetor.add(q2);vetor.add(q3);vetor.add(q4);vetor.add(q5);
		vetor.add(q6);vetor.add(q7);vetor.add(q8);vetor.add(q9);vetor.add(q10);
		for(int x=0;x<vetor.size();x++){
			if(vetor.get(x).getCor()!=null){
				System.out.println(vetor.get(x).calculaArea());
			}
		}
	}
}