package genericos;
import java.util.Scanner;
import java.util.*;
public class Vetor {
	public static <T extends Comparable <T>> void procuraValor(T[] vetor) {
		int oc = 0;
		Set<T> rep = new HashSet<>();
		for(int i = 0; i < vetor.length; i++) {
			if (rep.contains(vetor[i])) {
				continue;
			}
			else {
				oc = 0;
			}
			for(int j = 0; j < vetor.length; j++) {
				if(vetor[i].compareTo(vetor[j]) == 0) {
					oc++;
				}
			}
			if (oc >1 ) {
				System.out.printf(vetor[i] + " tem " + oc + " ocorrências.\n");
			}
			rep.add(vetor[i]);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Integer[] x;
		
		x = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			int p = sc.nextInt();
			x[i] = p;
		}
		
		String[] y;
		
		y = new String[n];
		
		for(int j = 0; j < n; j++) {
			String q = sc.next();
			y[j] = q;
		}
		
		procuraValor(x);
		procuraValor(y);
		
		sc.close();
	}
}
