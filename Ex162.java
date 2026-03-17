import java.util.Scanner;

public class Ex162 {

	public static void main(String[] args) {

		int caixaA;
		int caixaB;
		int limite;

	Scanner entrada = new Scanner(System.in);
	System.out.println("Sistema de Segurança de Elevador");

	System.out.println("Digiteo peso da caixa A: ");
	caixaA = entrada.nextInt();

	System.out.println("Digite o peso da caixa B: ");
	caixaB = entrada.nextInt();

	System.out.println("Digite o limite: ");
	limite = entrada.nextInt();
	
	
	int soma = caixaA + caixaB;

	if (soma < limite) {
		System.out.println("Operação Segura. ");
	} else {
		System.out.println("Alerta de Sobrecarga! ");
	}
	entrada.close();
	}
}
