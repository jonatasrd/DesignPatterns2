package cap4.interpreter;

public class Programa {

	public static void main(String[] args) {

		// (1+8)/(1+2)
		
		Expressao esquerda = new Subtracao(new Numero(50), new Numero(10));
		Expressao direita = new Soma(new Numero(2), new Multiplicacao(new Numero(2), new Numero(4)));
		Expressao conta = new Soma(esquerda, direita);

		int resultado = conta.avalia();
		System.out.println(resultado);
		
		Expressao divisao = new Divisao(new Numero(10), new Numero(2));
		System.out.println(divisao.avalia());
		
		Expressao raizQuadrada = new RaizQuadrada(new Numero(64));
		System.out.println(raizQuadrada.avalia());
		
		
	}

}
