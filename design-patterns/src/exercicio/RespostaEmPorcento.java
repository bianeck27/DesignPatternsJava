package exercicio;

public class RespostaEmPorcento implements Resposta {

	private Resposta outraResposta;

	public RespostaEmPorcento(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		} else if (outraResposta != null) {
			outraResposta.responde(req, conta);
		} else {
			//não existe próxima na corrente, e ninguém atendeu à requisição
			throw new RuntimeException("Formato de Resposta não encontrado");
		}

	}

}
