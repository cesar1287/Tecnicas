class Main{
	public static void main (String args[]){
		/*Pessoa p1 = new Pessoa("Ana",15);
		//p1.setNome("Ana");
		//p1.setIdade(15);
		Pessoa p2 = new Pessoa("João",18);
		//p2.setNome("João");
		//p2.setIdade(18);
		System.out.println (p1.getNome());
		System.out.println(p1.getIdade());
		System.out.println (p2.getNome());
		System.out.println(p2.getIdade());*/
		Pessoa p1 = new Pessoa();
		p1.setNome("Ana");
		p1.setIdade(13);
		Pessoa p2 = new Pessoa();
		p2.setNome("João");
		p2.setIdade(15);
		//System.out.println (p1.getNome());
		//System.out.println (p2.getNome());
		System.out.println(p1.nomeIdade());
		System.out.println(p2.nomeIdade());
		//p1 = p2;
		//System.out.println (p1.getNome());
		//System.out.println (p2.getNome());
	}
}