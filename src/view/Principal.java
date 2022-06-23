package view;

import controller.CriadorConteudo;
import controller.Inscrito;

public class Principal {
	public static void main(String[] args) {
		Inscrito inscrito = new Inscrito();
		CriadorConteudo criadorConteudo = new CriadorConteudo(inscrito);
		
		criadorConteudo.criarConteudo();
		inscrito.inscrever();
		inscrito.recebeMensagem();
	}
}
