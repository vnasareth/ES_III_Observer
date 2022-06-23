package controller;


public class CriadorConteudo implements IObservavel, IRecebeMensagem, ICriaConteudo {
	private Inscrito inscrito;
	private String acao;
	
	public CriadorConteudo(Inscrito inscrito) {
		this.inscrito = inscrito;
	}


	@Override
	public void notificaMudanca(String acao) {
		inscrito.update(acao);
	}



	@Override
	public void recebeMensagem() {
		acao = "receberMensagem";
		System.out.println("Recebendo Mensagem");
		notificaMudanca(acao);
		
	}


	@Override
	public void criarConteudo() {
		acao = "criarConteudo";
		System.out.println("Criando Conteudo");
		notificaMudanca(acao);
//		inscrito.recebeMensagem(notificaMudanca(acao));
	}


}
