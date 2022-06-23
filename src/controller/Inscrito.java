package controller;

public class Inscrito implements IObservador, IRecebeMensagem, IInscrever {
	
	public void inscrever() {
		System.out.println("Se inscrevendo no canal");
	}
	

	@Override
	public void recebeMensagem() {
		System.out.println("Recebendo Mensagem");
		
	}

	
	public void update(String acao) {
		if (acao.equals("inscrever")) {
			inscrever();
		}
		if (acao.equals("receberMensagem")) {
			recebeMensagem();
		}
//		if (acao.equals("criarConteudo")) {
//			criarConteudo();
//		}
		
	}


//	@Override
//	public void criarConteudo() {
////		acao = "criarConteudo";
////		System.out.println("Criando Conteudo");
////		notificaMudanca(acao);
//	}



}
