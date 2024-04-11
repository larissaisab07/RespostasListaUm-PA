public class Retangulo {
	public double base;
	public double altura;
	
		public Retangulo(double base, double altura) {
			this.base = base;
			this.altura = altura;
		}
		
			public double getBase() {
				return base;
			}
		public void setBase(double base) {
			this.base = base;
		}
		
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
			public double calcArea() {
				 double area;
				
				area = (base * altura);
				
				return area;
			}
			
			
			public double perimetro() {
				double peri;
				peri = (altura * 2) + (base * 2);
				return peri;
			}
}


package listaDeAtividades;

public class Testes {
	public static void main(String [] args) {
		Retangulo r1 = new Retangulo(2, 5);
		
		System.out.println(r1.calcArea());
		System.out.println(r1.perimetro());
		
		r1.setAltura(8);
		r1.setBase(4);
		System.out.println("\n" + r1.getAltura() + "\n" + r1.getBase());
		
	}		
}

