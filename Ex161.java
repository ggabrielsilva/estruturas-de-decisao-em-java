import java.util.Scanner;

public class Ex161 {

	public static void main(String[] args) {
	
	int numero;
	
	Scanner entrada = new Scanner(System.in);

	System.out.println("Programa de número par ou ímpar");

	numero = entrada.nextInt();

	if (numero % 2 == 0) {
			System.out.println("\n O número é par");
			System.out.println("\nQuadrado:\n" + (numero * numero));
		} else {
			System.out.println("O número é ímpar");
			System.out.println("\nCubo: " + (numero * numero * numero));
		}
		entrada.close();
	}
}