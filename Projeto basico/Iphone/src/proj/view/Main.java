package proj.view;

import java.util.Scanner;

import proj.aparelho.Iphone;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        Iphone meuIphone = new Iphone();
        
        // Testando o reprodutor musical
        System.out.println("Digite o nome da sua musica favorita: ");
        String musica = scanner.nextLine();
        meuIphone.selecionarMusica(musica);
        meuIphone.tocar(musica);
        meuIphone.pausar();

        // Testando o aparelho telefônico
        System.out.println("\nDigite o seu numero: ");
        String numero = scanner.nextLine();
        meuIphone.ligar(numero);
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        // Testando o navegador na internet
        System.out.println("\nDigite a sua URL: \nEx:www.exemplo ");
        String url = scanner.next();
        meuIphone.adicionarNovaAba(url);
        meuIphone.exibirPagina(url);
        meuIphone.atualizarPagina();
    }

}
