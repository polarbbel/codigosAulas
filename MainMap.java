package genericos;
import java.util.Scanner;
import java.util.*;
public class MainMap{
	public static <K,V> void procuraValor(Map<K,V> mapa, K chave){
		if (mapa.get(chave) == null) {
			System.out.printf("chave: "+ chave + ", valor: null");
		}
		else {
			System.out.println("chave: "+ chave + ", valor: " + mapa.get(chave));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		Map <String, Integer> m1 = new HashMap<String, Integer>();
		Map <String, String> m2 = new HashMap< String, String>();
		
		for(int i = 0; i < n; i++) {
			String a = sc.next();
			int b = sc.nextInt();
			m1.put(a, b); 
		}
		
		for(int j = 0; j < n; j++) {
			String c = sc.next();
			String d = sc.next();
			m2.put(c, d); 
		}
		
		String chave1 = sc.next();
		String chave2 = sc.next();
		
		procuraValor(m1, chave1);
		procuraValor(m2, chave2);
		
		sc.close();
	}
}