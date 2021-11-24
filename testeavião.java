package Turma29;

public class testeavião {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		avião boeing =new avião("carlos");		
		boeing.imprimirInfo();

		boeing.setNomeProprietario("pedro");
		boeing.setCor("vermelho");
		boeing.setMetros(1);
		boeing.setAltura(3);
		
		boeing.imprimirInfo();
	
	}

}