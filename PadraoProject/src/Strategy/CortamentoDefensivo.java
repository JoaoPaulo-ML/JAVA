package Strategy;

public class CortamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Defendendo");
    }
}
