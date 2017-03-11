package cap7.command;

public class ConcluiPedido implements Comando{

	private Pedido pedido;
	
	public ConcluiPedido(Pedido pedido) {
        this.pedido = pedido;
    }
	@Override
	public void executa() {
		System.out.println("concluindo pedido " + pedido.getCliente());
		pedido.finaliza();
	}

}
