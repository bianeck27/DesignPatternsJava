
public class TesteDeDescontos {

	public static void main(String[] args) {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		Item caneta = new Item("Caneta", 15.0);
		Item lapis = new Item("Lápis", 15.0);
		Item borracha = new Item("Borracha", 15.0);
		
		orcamento.adicionaItem(caneta);
		orcamento.adicionaItem(lapis);
		orcamento.adicionaItem(borracha);
		
		double descontoFinal = descontos.calcula(orcamento);
		
		System.out.println(descontoFinal);
	}

}
