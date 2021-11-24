package Turma29;

public class testepaciente {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		paciente entradapaciente=new paciente("\npedro"     ,"\nvinte e um",      "\nrua um",       "\npedro@gmail,com"      ,145986986);
		entradapaciente.imprimirInfo();
		
		entradapaciente.setNome("vinicios");
		entradapaciente.setIdade("vinte");
		entradapaciente.setEndereço("rua joana");
		entradapaciente.setEmail("vinivios@gmail.com");
		entradapaciente.setTelefone(1225889985);
		
		entradapaciente.imprimirInfo();

	}

}
