
public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	private boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
		return existe("Caneta", orcamento) && existe("Lápis", orcamento);
	}

	private boolean existe(String nomeItem, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getNome().equals(nomeItem)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double desconta(Orcamento orcamento) {
		if (aconteceuVendaCasadaEm(orcamento)) {
			return orcamento.getValor() * 0.05;
		}
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
