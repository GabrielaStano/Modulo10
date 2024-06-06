package modulo10;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, genero, cargo;
		int back=0;
		int	totalFrontMulheresT = 0;
		int totalMobileHomensMaiores40 = 0;
		int totalFullNaoBinareiosMenors30 = 0;
		int totalPessoas = 0, mediaIdade=0, totalIdade=0;
		char continuar;
		Scanner leia = new Scanner (System.in);
		
				
		do {
			
			System.out.println("idade: ");
			idade = leia.nextInt();
			
			System.out.println("\n\t\tIDENTIDADE DE GÊNERO");
			System.out.println("\n1- Mulher Cis");
			System.out.println("\n2- Homem Cis");
			System.out.println("\n3- Não Binário");
			System.out.println("\n4- Mulher Trans");
			System.out.println("\n5- Homem Trans");
			System.out.println("\n1- Outros");
			genero = leia.nextInt();
			
			System.out.println("\n\t\tPESSOA DESENVOLVEDORA: ");
			System.out.println("\n1- Backend");
			System.out.println("\n2- Frontend");
			System.out.println("\n3- Mobile");
			System.out.println("\n4- FullStack");
			cargo = leia.nextInt();
			
			switch(cargo) {
			case 1:
				back ++;
				break;
			case 2: 
				if(genero == 1 || genero == 4) {
					totalFrontMulheresT ++;
				}
				break;
			case 3:
				if(genero == 2 || genero == 5 && idade> 40) {
					totalMobileHomensMaiores40 ++;
				}
				break;
			case 4:
				if(genero == 3 && idade < 30) {
					totalFullNaoBinareiosMenors30 ++;
				}
				break;
			}
				
			System.out.println("\n\n Deseja continuar(S/N)");
			continuar = leia.next().charAt(0);
			
			totalPessoas ++;
			totalIdade = totalIdade + idade;
			
		}while(continuar == 'S' || continuar =='s');
			
			mediaIdade = totalIdade/totalPessoas;
		
		System.out.println("\nN° de pessoas desenvolvedoras Backend: " + back);
		System.out.println("\nTotal de Mulhres Cis e Trans desenvolvedoras Frontend: " + totalFrontMulheresT);
		System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos:  " + totalMobileHomensMaiores40);
		System.out.println("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + totalFullNaoBinareiosMenors30);
		System.out.println("\nO número total de pessoas que responderam à pesquisa:  " + totalPessoas);
		System.out.println("\nA média de idade das pessoas que responderam à pesquisa:" + mediaIdade);
	}

}
