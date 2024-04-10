public class Pessoa {
 private String nome;
 private int Idade;
 private double Altura;

 public Pessoa (String nome, int Idade, double Altura) {
	 this.nome = nome;
	 this.Idade = Idade;
	 this.Altura = Altura;
	 
 }
 
 public String getNome () {
	 return nome;
	 
 }
  public void setNome (String nome) {
	  this.nome = nome;
	  
  }
  public int getIdade () {
	  return Idade;
	  
  }
  public void setIdade (int Idade) {
	  this.Idade = Idade;
	  
  }
  public void setAltura (double Altura) {
	  this.Altura = Altura;
	
  }
  public double getAltura () {
	  return Altura;
	  
  }
  public String toString () {
	  return "Nome:" + nome + "\nIdade:" + Idade + "\nAltura:" + Altura ;
	  
  }
  
}
