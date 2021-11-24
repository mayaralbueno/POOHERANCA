package Turma29;

public class testeeletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		eletronico novoeletronico=new eletronico("disponivel","preto","motorola");
		novoeletronico.imprimirInfo();
		
		novoeletronico.setDisponivel("disponivel");
		novoeletronico.setMarca("lg");
		novoeletronico.setCor("branco");
		
		novoeletronico.imprimirInfo();

	}

}
