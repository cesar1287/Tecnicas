class Pessoa{
	String nome;
	int idade;
	String nomeIdade;
	/*Pessoa(String pnome,int pidade) {
		this.setNome(pnome);
		this.setIdade(pidade);
	}*/
	void setNome(String pnome){
		nome = pnome;
	}
	void setIdade(int pidade){
		idade = pidade;
	}
	/*int getIdade(){
		return idade;
	}
	String getNome(){
		return nome;
	}*/
	String nomeIdade(){
		nomeIdade = "NOME:"+nome+",IDADE:"+idade;
		return nomeIdade;
	}
} 