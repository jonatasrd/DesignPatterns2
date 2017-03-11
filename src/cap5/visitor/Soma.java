package cap5.visitor;

public class Soma implements Expressao {

	private Expressao esquerda;
    private Expressao direita;

    public Soma(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }
    
    @Override
    public int avalia() {
        int resultadoDaEsquerda = getEsquerda().avalia();
        int resultadoDaDireita = getDireita().avalia();
        return resultadoDaEsquerda + resultadoDaDireita;
    }

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaSoma(this);
	}

	public Expressao getDireita() {
		return direita;
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

}
