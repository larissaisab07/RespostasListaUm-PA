public class DataHora {
  private Data data;
  private Hora hora;
  
  public DataHora (Data data, Hora hora) {
	  this.data = data;
	  this.hora = hora; 
	 
  }
  public void setData (Data data) {
	 this.data = data;
	 
  }
  public void setHora (Hora hora) {
	  this.hora = hora;
  }
	  
    public String toString () {
	  return data.toString () + "\n" + hora.toString ();
	  
  }
}
