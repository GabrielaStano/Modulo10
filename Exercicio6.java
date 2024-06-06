package modulo10;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, num, somaNumInt=0;
		float media;
		Scanner leia = new Scanner (System.in);
		
		
		do {
			System.out.println("Digite um número ( digite 0 para encerrar): ");
			num = leia.nextInt();
			
			if(num !=0 && num % 3 == 0) {
				somaNumInt += num;
					x ++;
			}
		
		}while(num != 0);
		
		media = somaNumInt/ x;
		System.out.println("A média de todos os números múltiplos de 3 é: " + media);
		
	}

}
