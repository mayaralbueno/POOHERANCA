package Turma29;

public class testeconta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		conta contacliente=new conta ("\nmaria","\nquarenta","\nmarialindinha@gmai.com","\nrua flor",1858885);
		contacliente.imprimirInfo();
		
		contacliente.setNome("\njin");
		contacliente.setIdade("\nvinte e nove");
		contacliente.setEmail("\njindobts@gmail.com");
		contacliente.setEndereço("\nCoreia do sul na bighit");
		contacliente.setTelefone(5422656);
		
		contacliente.imprimirInfo();
	}

}
