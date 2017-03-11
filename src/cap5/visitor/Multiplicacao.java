package cap5.visitor;

public class Multiplicacao implements Expressao {
	
	private Expressao direita;
	private Expressao esquerda;


	public Multiplicacao(Expressao direita, Expressao esquerda) {
		this.direita = direita;
		this.esquerda = esquerda;
	}
	
	@Override
	public int avalia() {
		int resultadoDaEsquerda = esquerda.avalia();
		int resultadoDaDireita = direita.avalia();
		return resultadoDaEsquerda * resultadoDaDireita;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaMultiplicacao(this);
	}

	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public Expressao getDireita() {
		return direita;
	}

}
