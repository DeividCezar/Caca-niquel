import java.util.Scanner;
import java.util.Random;

public class Game {

	public static void main(String[] args) {
		
		int saldo = 100, variavelJogo = 3, dado;
		
		Scanner ler = new Scanner(System.in);
		Random gerador = new Random();
		
		while (saldo < 200 && saldo > 0 && variavelJogo != 2) {
			
		System.out.println("[1] - Ver o saldo atual;");
		System.out.println("[2] - Parar de jogar e ficar com o saldo atual;");
		System.out.println("[3] - Continuar jogando.");
		
		variavelJogo = ler.nextInt();
		
		switch (variavelJogo) {

		case 1:
			
			System.out.println("O saldo atual é " + saldo);
			
		break;

		case 2:
			
			System.out.println("Obrigado pela participação, o saldo final é " + saldo);
			
		break;

		case 3:
			
			dado = 1 + gerador.nextInt(100);
			
			if (dado < 50) {saldo -= dado;}
			else if (dado > 50) {saldo += dado/2;}
			
			if (saldo >= 200) {System.out.println("Você ganhou!");} 
			else if (saldo <= 0) {System.out.println("Saldo zerado, você perdeu!");}
			
		break;

		default:
			
			System.out.println("Valor inválido, tente novamente!");
			} 		
		}		
	}
}
