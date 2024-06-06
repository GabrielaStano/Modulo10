package modulo10;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// num int
		// repetir ate que o 0 seja digitado;
		// saida: soma de todos os numeros positivos;
		
		int num, soma = 0;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("Digite um número (digite 0 para encerrar): ");
			num = leia.nextInt();
			
			if(num>0) {
				soma = soma +num;
			}
		}while(num !=0);
		
		System.out.println("\nA soma dos números positivos é: " + soma);
	}

}
