package cap5.visitor;

public interface Expressao {
	int avalia();
	void aceita(Visitor visitor);
}
