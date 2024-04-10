public class classeEndereco {
  public String rua;
  public int numero;
  public String complemento;
  public String bairro;
  public String cidade;
  public String estado;
  private String cpf;
  
  public classeEndereco (String rua, int numero, String complemento, String bairro, String cidade, String estado, String cpf) {
	  this.rua = rua;
	  this.numero = numero;
	  this.complemento = complemento;
	  this.bairro = bairro;
	  this.cidade = cidade;
	  this.estado = estado;
	  this.cpf = cpf;
	  
  }
   public String getRua () {
	   return rua;
	   
   }
   public void setRua (String rua) {
	   this.rua = rua;
	   
   }
   public int getNumero () {
	   return numero;
	   
   }
   public void setNumero (int numero) {
	   this.numero = numero;
	   
   }
   public String getComplemento () {
	   return complemento;
	   
   }
   public void setComplemento (String complemento) {
	   this.complemento = complemento;
	   
   }
   public String getBairro () {
	   return bairro;
	   
   }
   public void setBairro (String bairro) {
	   this.bairro = bairro;
	   
   }
   public String getCidade () {
	   return cidade;
	   
   }
   public void setCidade (String cidade) {
	   this.cidade = cidade;
	   
   }
   public String getEstado () {
	   return estado;
	   
   }
   public void setEstado (String estado) {
	   this.estado = estado;
	   
   }
   private String getCpf () {
	   return cpf;
	   
   }
   private void setCpf (String cpf) {
	   this.cpf = cpf;
	   
   }
   
   
   }
