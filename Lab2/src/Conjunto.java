public class Conjunto {
	int vetor[],aux=0;
	void mostrarConjunto(int[] vetor){
		for(int x=0;x<vetor.length;x++)
			System.out.println(vetor[x]);
	}
	//1
	void criaConjunto(int tamanho){
		vetor = new int[tamanho];
	}
	//2
	void insereConjunto(int num){
		vetor[aux] = num;
		aux++;
	}
	//3
	void persistencia(int num,int[] vetor){
		for(int x=0;x<vetor.length;x++){
			if(num==vetor[x]){
				System.out.println("O elemento "+num+" pertence ao conjunto");
				x = vetor.length;
			}else{
				System.out.println("O elemento "+num+" não pertence ao conjunto");
				break;
			}
		}
	}
	//4
	void ehSubConjunto(int[] vetor1,int[] vetor2){
		int aux[] = new int[vetor2.length],zeros = 0;
		for(int i=0;i<vetor2.length;i++){
			aux[i] = vetor2[i];
		}
		primeiro_for:
		for(int x=0;x<vetor1.length;x++){
			for(int y=0;y<aux.length;y++){
				if(vetor1[x] == aux[y]){
					aux[y] = 0;
					zeros++;
					continue primeiro_for;
				}
			}
		}
		if(zeros==vetor1.length)
			System.out.println("É Subconjunto");
		else
			System.out.println("Não é Subconjunto");
	}
	//5
	int[] uniaoConjunto(int[] vetor1,int[] vetor2){
		int uniao[],cont = 0;
		primeiro_for:
		for(int x=0;x<vetor1.length;x++){
			for(int y=0;y<vetor2.length;y++){
				if(vetor1[x] == vetor2[y]){
					vetor2[y] = 0;
					cont++;
					continue primeiro_for;
				}
			}
		}
		uniao = new int[vetor1.length+(vetor2.length-cont)];
		cont=0;
		for(int x=0;x<vetor1.length;x++){
			uniao[cont] = vetor1[x];
			cont++;
		}
		for(int x=0;x<vetor2.length;x++){
			if(vetor2[x]!=0){
				uniao[cont] = vetor2[x];
				cont++;
			}
		}
		return uniao;
	}
	//6
	int[] interseccaoConjunto(int[] vetor1,int[] vetor2){
		int inter[],cont=0,aux=0,x;
		int aux1[] = new int[vetor1.length+vetor2.length];
		primeiro_for:
		for(x=0;x<vetor1.length;x++){
			for(int y=0;y<vetor2.length;y++){
				if(vetor1[x] == vetor2[y]){
					aux1[x] = vetor1[x];
					vetor2[y] = 0;
					cont++;
					continue primeiro_for;
				}
			}
		}
		inter = new int[cont];
		for(x=0;x<aux1.length;x++){
			if(aux1[x]!=0){
				inter[aux]=aux1[x];
				aux++;
			}
		}
		return inter;
	}
	//7
	String diferencaConjunto(int[] vetor1,int[] vetor2){
		int cont=0;
		String dif="A diferença entre os conjuntos é o(s) número(s): ";
		primeiro_for:
		for(int x=0;x<vetor1.length;x++){
			for(int y=0;y<vetor2.length;y++){
				if(vetor1[x]!=vetor2[y]){
					dif+=vetor1[x]+" ";
					cont++;
					continue primeiro_for;
				}
			}
		}
		if(cont==0)
			return "Não existe diferença entre os conjuntos";
		else
			return dif;
	}
	//8
	String produtoCartesiano(int[] vetor1,int[] vetor2){
		String produto="",ini="(",fim=")";
		produto+=ini;
		for(int x=0;x<vetor1.length;x++){
			for(int y=0;y<vetor2.length;y++){
				produto+=ini;
				produto+=vetor1[x]+","+vetor2[y];
				produto+=fim;
				if(!(x+1==vetor1.length && y+1==vetor2.length))
					produto+=",";
			}
		}
		produto+=fim;
		return "O produto cartesiano é: "+produto;
	}
}
