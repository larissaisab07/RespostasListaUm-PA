public class classeLivro {
  public String titulo;
  public String autor;
  public String editora;
  public int anoPublicacao;
  
  public classeLivro (String titulo, String autor, String editora, int anoPublicacao) {
	  this.titulo = titulo;
	  this.autor = autor;
	  this.editora = editora;
	  this.anoPublicacao = anoPublicacao;
	  
  }
  public String getTitulo () {
	  return titulo;
	  
  }
  public void setTitulo (String titulo) {
	  this.titulo = titulo;
	  
  }
  public String getAutor () {
	  return autor;
	  
  }
  public void setAutor (String autor) {
	  this.autor = autor;
	  
  }
  public String geteditora () {
	  return editora;
	  
  }
  public void setEditora (String editora) {
	  this.editora = editora;
	  
  }
  public int getAnoPublicacao () {
	  return anoPublicacao;
	  
  }
  public void setAnoPublicacao (int anoPublicacao) {
	  this.anoPublicacao = anoPublicacao;
	  
  }
  
  
}
