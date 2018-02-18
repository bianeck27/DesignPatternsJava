package exercicio;

public class RespostaEmXml implements Resposta {

	private Resposta outraResposta;

	public RespostaEmXml(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular></conta>");
		} else {
			outraResposta.responde(req, conta);
		}
	}

}
