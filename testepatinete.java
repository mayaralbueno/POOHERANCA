package Turma29;

public class testepatinete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		patinete produtopatinete=new patinete("verde",   "navacriaça",   150);
		produtopatinete.imprimirInfo();
		
		produtopatinete.setMarca("\njuvenilkids");
		produtopatinete.setValor(200);
		
		produtopatinete.imprimirInfo();
			

	}

}
