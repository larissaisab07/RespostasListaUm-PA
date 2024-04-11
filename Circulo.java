public class Circulo {
	public double raio;
	
	public Circulo(double r) {
		this.raio = r;
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double r) {
		this.raio = r;
	}
	
	public double calcArea() {
		double pi;
		double area;
		pi = 3.14;
		
		area = (raio * raio) * pi;
		return area;
	}
	
	public double calcPerimetro() {
		double pi;
		double peri;
		pi = 3.14;
		
		peri = 2 * pi * raio;
		return peri;
	}
}


package listaDeAtividades;

public class Testes {
	public static void main(String [] args) {
		Circulo c1 = new Circulo(4);
		
		System.out.println(c1.calcArea());
		System.out.println(c1.calcPerimetro());
		
		c1.setRaio(8);
		System.out.println("O valor do novo raio do círculo é: " + c1.getRaio());
		
	}		
}

