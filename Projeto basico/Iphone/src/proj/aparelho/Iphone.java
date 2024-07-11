package proj.aparelho;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{


    @Override
    public void tocar() {
        System.out.println("Reproduzindo musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Nova aba adicionada com URL: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada.");
    }

}
