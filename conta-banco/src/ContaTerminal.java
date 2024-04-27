import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número da conta!");
		int numero = sc.nextInt();
		System.out.println("Digite o numero da Agênciia!");
		String agencia = sc.next();		
		sc.nextLine();
		System.out.println("Digite o nome do cliente!");
		String nomeCliente = sc.nextLine();

		System.out.println("Digite o saldo da conta!");
		double saldo = sc.nextDouble();
		
		String informacaoDoCliente = "Olá " + nomeCliente + ", obrigado"
				+ " por criar uma conta em nosso banco, sua agência é " + agencia 
				+ ", conta " + numero + " e seu saldo " + saldo
				+ " já está disponível para saque.";
		
		System.out.println(informacaoDoCliente);
		sc.close();
		}
		catch(InputMismatchException e) {
			System.out.println("O numero da conta e o saldo precisam ser numérico");
		}
	}

}
