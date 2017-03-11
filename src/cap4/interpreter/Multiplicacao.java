package cap4.interpreter;

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

}
