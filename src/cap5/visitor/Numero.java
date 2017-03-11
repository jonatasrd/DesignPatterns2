package cap5.visitor;

public class Numero implements Expressao {
	
	private int numero;
	
    public Numero(int numero) {
        this.numero = numero;
    }
    
	public int avalia() {
		return getNumero();
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaNumero(this);
	}

	public int getNumero() {
		return numero;
	}

}
