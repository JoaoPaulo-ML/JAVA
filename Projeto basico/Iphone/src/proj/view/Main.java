package proj.view;

import proj.aparelho.Iphone;

public class Main {

	public static void main(String[] args) {
		
        Iphone meuIphone = new Iphone();
        
        // Testando o reprodutor musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Minha Musica Favorita");

        // Testando o aparelho telefônico
        meuIphone.ligar("123-4567");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando o navegador na internet
        meuIphone.exibirPagina("https://www.exemplo.com");
        meuIphone.adicionarNovaAba("https://www.novaaba.com");
        meuIphone.atualizarPagina();
    }

}
