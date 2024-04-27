import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o n�mero da conta!");
		int numero = sc.nextInt();
		System.out.println("Digite o numero da Ag�nciia!");
		String agencia = sc.next();		
		sc.nextLine();
		System.out.println("Digite o nome do cliente!");
		String nomeCliente = sc.nextLine();

		System.out.println("Digite o saldo da conta!");
		double saldo = sc.nextDouble();
		
		String informacaoDoCliente = "Ol� " + nomeCliente + ", obrigado"
				+ " por criar uma conta em nosso banco, sua ag�ncia � " + agencia 
				+ ", conta " + numero + " e seu saldo " + saldo
				+ " j� est� dispon�vel para saque.";
		
		System.out.println(informacaoDoCliente);
		sc.close();
		}
		catch(InputMismatchException e) {
			System.out.println("O numero da conta e o saldo precisam ser num�rico");
		}
	}

}
