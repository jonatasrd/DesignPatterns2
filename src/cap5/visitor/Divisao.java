package cap5.visitor;

public class Divisao implements Expressao {
	
	private Expressao esquerda;
	private Expressao direita;

	Divisao(Expressao esquerda, Expressao direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia(){
		int resultadoDireita = direita.avalia();
		int resultadoEsquerda = esquerda.avalia();
		return resultadoEsquerda / resultadoDireita;
	}

	@Override
	public void aceita(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}

}
