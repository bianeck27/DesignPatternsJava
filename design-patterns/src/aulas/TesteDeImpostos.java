package aulas;

public class TesteDeImpostos {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.calcula(orcamento, iss);
		calculador.calcula(orcamento, icms);
	}
}
