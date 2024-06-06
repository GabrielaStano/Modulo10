package modulo10;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// idade de varias pessoas - int idade
		// saida - total de pessoas idade < 21
		// saida - total de pessoas idade > 50
		// finalizar caso digitar idade negativa
		
		int idade, totalIdadeMenor=0, totalIdadeMaior=0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite uma idade (digite uma idade negativa para encerrar): ");
		idade = leia.nextInt();
		
		while(idade>=0) {
			
			if(idade< 21) {
				totalIdadeMenor ++;
			}else {
				totalIdadeMaior ++;
			}
			
			System.out.println("Digite uma idade (digite uma idade negativa para encerrar): ");
			idade = leia.nextInt();
			
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + totalIdadeMenor);
		System.out.println("Total de pessoas maiores 50 21 anos: " + totalIdadeMaior);
		
		leia.close();
	}

}
