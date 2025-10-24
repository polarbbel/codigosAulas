package classes;
import java.util.Scanner;
import java.util.*;
public class divisaovetor {
	public static int[] divisao(int vet[], int n){
		int[] newvet= new int[5];
		for(int i = 0; i < 5; i++) {
			newvet[i] = vet[i] / n;
		}
		return newvet;
	}
	
	public static void main (String[] args) throws Exception {
		int[] vet= {500,1000,1500,3000,5000};
		
		Scanner sc = new Scanner(System.in);
		try {
			int x = sc.nextInt();
			int[] novo = divisao(vet, x);
			
			for(int i = 0; i < 5; i++) {
				if(i == 4)
					System.out.printf("%d", novo[i]);
				else {
					System.out.printf("%d ", novo[i]);
				}	
			}
		} catch (InputMismatchException e1) {
			System.out.printf("Caractere inválido");
		}catch (ArithmeticException e2) {
			System.out.printf("Erro de divisão por zero");
		} finally {
			
		}
	}
	
}



