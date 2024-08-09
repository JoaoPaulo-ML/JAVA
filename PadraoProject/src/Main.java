import Strategy.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Comportamento ataque = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento defesa = new CortamentoDefensivo();

        Robo robo = new Robo();

        int op;

        do{
            System.out.println("digite as ações do Robo: " + robo.getNome() + "\n0-parar\n1-Ataque\n2-defender\n3-mover");
            op = scanner.nextInt();

            switch (op){
                case 0:
                    System.out.println("Robo descansando zzzzzzzzz");
                    break;
                case 1:
                    robo.setComportamento(ataque);
                    robo.mover();
                    break;
                case 2:
                    robo.setComportamento(defesa);
                    robo.mover();
                    break;
                case 3:
                    robo.setComportamento(normal);
                    robo.mover();
                    break;
            }
        }while(op != 0);
    }
}