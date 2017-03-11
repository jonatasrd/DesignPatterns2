package cap7.command;

public class PagaPedido implements Comando{

	Pedido pedido;
	
	public PagaPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public void executa() {
		System.out.println("pagando pedido " + pedido.getCliente());
		pedido.paga();
	}

}
