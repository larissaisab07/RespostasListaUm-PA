public class Data {
	public int dia;
	public int mes;
	public int ano;
	
	public Data(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.ano = a;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int d) {
		this.dia = d;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int m) {
		this.mes = m;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int a) {
		this.ano = a;
	}
	
		public String toString() {
			return dia + "/" + mes + "/" + ano;
		}
}


package listaDeAtividades;

public class Testes {
	public static void main(String [] args) {
		Data d1 = new Data(23, 02, 2007);
		
		System.out.println(d1.toString());
		
		d1.setDia(28);
		d1.setMes(05);
		d1.setAno(2023);
		System.out.println("\nA nova data é: "+ d1.toString());
	}		
}

