package Main;
import java.util.Scanner;

public class Aula3 {
/* Exercícios
	Imprima todos os números de 150 a 300.
	Imprima a soma de 1 até 1000.
	Imprima todos os múltiplos de 3, entre 1 e 100.
	Escrever um programa que leia repetidamente uma
	nota de um aluno fornecida pelo usuário até que o
	usuário digite -1 para finalizar. Calcule e imprima
	média de todas as notas no final. */
	
	public static void main(String Args[]) {
		//imprima todos os numeros de 150 a 300
		for(int i = 150; i <= 300; i++) {
			System.out.println(i);
		}
		
		// imprima a soma de 1 até 1000
		int soma1 = 0;
		for(int i = 1; i <= 1000; i++) {
			soma1+=i;
			i++;
			System.out.println(soma1);
		}
		// imprima todos os múltiplos de 3, entre 1 e 100.
		for(int i = 0; i <=100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		Scanner sc = new Scanner(System.in);
		
		float soma2 = 0;
		int i = 0;
		//leia repetidamente uma nota de um aluno fornecida pelo usuário até que o usuário digite -1 para finalizar.
		float x = 0;
		while(x != -1) {
			float y = sc.nextFloat();
				if (y == -1) {
					float media = soma2 / i;
					System.out.println("Media: "+media);
				}
			soma2+=y;
			x = y;
			i++;	
		}
		
		sc.close();
	}
}
