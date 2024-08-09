package Strategy;

public class Robo {
    private Comportamento comportamento;
    protected String nome = "Bob";

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public String getNome() {
        return nome;
    }

    public void mover(){
        comportamento.mover();
    }

}
