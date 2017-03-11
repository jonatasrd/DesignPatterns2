package cap6.bridge.adapter;

public class GoogleMaps implements Mapa{

	//exemplo do padrão bridge
	@Override
	public String devolveMapa(String rua) {
		// codigo aqui que consome o google
		return "rua";
	}

}
