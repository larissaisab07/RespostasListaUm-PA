public class contaCorrente {
 private int numeroDaConta;
 private double saldo;
  
 public contaCorrente (int numeroDaConta, double saldo) {
	 this.numeroDaConta = numeroDaConta;
	 this.saldo = saldo;
	 
 }
 public double getSaldo () {
	 return saldo;
	 
 }
 public void setSaldo (double saldo) {
	 this.saldo = saldo;
	 
 }
 public void depositar (double deposito) {
	 saldo = deposito + saldo;
	 
 }
 public void sacar (double saque) {
	 saldo = saldo - saque;
	 
 }
 public String toString () {
	 return "Conta:" + numeroDaConta + "\nSaldo: R$" + saldo;
	 
 }
}

public class classeTeste {
 public static void main (String [] args) {
	 contaCorrente Conta1 = new contaCorrente (12, 2300);
	 Conta1.sacar(300);
	  Conta1.depositar(400);
	  
	  System.out.println (Conta1.getSaldo());
 }

}
