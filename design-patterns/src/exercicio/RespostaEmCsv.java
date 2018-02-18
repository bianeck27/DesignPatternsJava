package exercicio;

public class RespostaEmCsv implements Resposta {

	private Resposta outraResposta;

	
	public RespostaEmCsv(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}


	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		}else {
			outraResposta.responde(req, conta);
		}
	}


}
