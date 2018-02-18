package aulas;

public class TesteDeICCC {

	public static void main(String[] args) {
		Imposto iccc = new ICCC();
		
		Orcamento orcamento1 = new Orcamento(100.0);
		Orcamento orcamento2 = new Orcamento(2000.0);
		Orcamento orcamento3 = new Orcamento(10000.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.calcula(orcamento1, iccc);
		calculador.calcula(orcamento2, iccc);
		calculador.calcula(orcamento3, iccc);
	}
}
