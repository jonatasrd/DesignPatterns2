package cap8.facade;

public class ServicoSingleton {
	
	private static Servico instancia;

	  public Servico getInstancia() {
	    if(instancia == null) {
	      instancia = new Servico();
	    }
	    return instancia;
	  }

}
