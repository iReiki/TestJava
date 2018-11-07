import java.util.Scanner;

public class Main {
	
	private static Scanner sc;
	
	public static void main (String[] args) {
		
		sc = new Scanner(System.in);
		
		try {
			System.out.println("Saisir un nombre :");
			int nb = sc.nextInt();
		}
		catch (Exception erreur) {
			System.out.println("La saisie n'est pas un nombre.");
			// System.out.println(erreur.toString());
			erreur.printStackTrace();
			// test
		}
		
	}
}
