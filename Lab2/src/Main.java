public class Main {
	public static void main(String[] args) {
		Conjunto c1 = new Conjunto();
		Conjunto c2 = new Conjunto();
		c1.criaConjunto(3);
		c2.criaConjunto(4);
		//professor se for testar inserindo numeros,altere o tamanho do vetor antes
		//no criaConjunto,eu sempre esquecia testando :)
		c1.insereConjunto(1);
		c1.insereConjunto(2);
		c1.insereConjunto(3);
		c2.insereConjunto(1);
		c2.insereConjunto(2);
		c2.insereConjunto(3);
		c2.insereConjunto(4);
		//c1.persistencia(1, c1.vetor);
		//c1.ehSubConjunto(c1.vetor, c2.vetor);
		//c1.mostrarConjunto(c1.uniaoConjunto(c1.vetor, c2.vetor));
		
		/*Professor,sobre a 3�,uma solu��o que eu ia propor,era trocar o int por
		por String pra aceitar qualquer coisa,e mudar na declara��o dos m�todos,atributos
		e passagem de par�metro,mas como todas as outras quest�es envolvem n�meros,pra
		n�o ficar aquela "ruma" de coment�rios,resolvi comentar aqui a resposta da 3�
		dissertada*/
		
		//c2.mostrarConjunto(c2.interseccaoConjunto(c1.vetor, c2.vetor));
		System.out.println(c1.produtoCartesiano(c1.vetor, c2.vetor));
	}
}
