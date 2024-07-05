
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		
		System.out.println("Discando...\n");
		
		do {
			
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alo !!!");
	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("\tAtendeu? " + atendeu);
		
		return !atendeu;
	}
}