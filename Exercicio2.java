package modulo10;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, num, pares=0, impares=0;
		Scanner leia = new Scanner (System.in);
		
		for ( i = 1; i <=10; i++) {
			System.out.println("Digite o " + i + "° número: ");
			num = leia.nextInt();
				if(num % 2 == 0) {
					pares ++;
				}else {
					impares ++;
				}
				
		}
	System.out.println("Total de números pares: " + pares);
				System.out.println("Total de números ímpares: " + impares);
	}
}
