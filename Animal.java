public  class Animal {
	public String nome;
	public String tipo;
	
	public Animal(String n, String t) {
		this.nome = n;
		this.tipo = t;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	
	public  void emitirSom() {
		
	}
		
	}



package listaDeAtividades;

public class Testes {
	public static void main(String [] args) {
		Animal a1 = new Animal("Cachorro", "Terrestre");
		
		System.out.println(a1.getNome());
		System.out.println(a1.getTipo());
		
		a1.setNome("Águia");
		a1.setTipo("Voador");
		
		System.out.println("\n" + a1.getNome());
		System.out.println(a1.getTipo());


	}		
}
