package Turma29;

public class conta {
	
	private String nome;
	private String idade;
	private String email;
	private String endereço;
	private double telefone;
	
	public conta(String nome,String idade,String email,String endereço,double telefone)
	{
		this.nome=nome;
		this.idade=idade;
		this.email=email;
		this.endereço=endereço;
		this.telefone=telefone;
	}
      public conta(String nome)
      {
    	  this.nome=nome;
      }
      public void imprimirInfo()
      {
   	  System.out.println("\n conta bancaria de um cliente"   +nome+    "\nidade"  +idade+  "\nemail"   +email+     "\nendereço"  +endereço+  "\ntelefone"  +telefone); 
      }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public double getTelefone() {
		return telefone;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
       
}
