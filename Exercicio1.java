package modulo10;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
// 	ler 2 numeros inteiros
// primeiro numero < segundo numero
// Caso contrario, exibir "Intevalo inválido!"
// mostrar numeros que são multiplos por 3 e 5
		
	int i, n1, n2, multiplos;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nEscreva o primeiro número: ");
	n1 = leia.nextInt();
	System.out.println("\nEscreva o segundo número: ");
	n2 = leia.nextInt();
	
	if(n1 < n2) {
		for(i = n1; i<=n2; i ++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é um múltiplo de 3 e 5.");
			}
		}
	}else {
			System.out.println("Intervalo inválido");
		}
	  leia.close();
	}
}