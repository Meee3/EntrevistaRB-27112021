import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.println("O Resultado do Primeiro Exercício");

	One();
	Two();
	}

	
	public static void One() {
		int indice = 13; 
		int soma = 0; 
		int K = 0;
		
		while(K < indice) {
			K = K + 1;
			soma = soma + K;
		}
		System.out.println(soma);
		
	}
	
	public static void Two() {
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Insira um intervalo");
		//inserir via scanner int

		
		//int[] meuVetorzinho = new int[5];
		int[] intervalo = {0,1,2};
		int[] novoVetor = new int[3];
		
		//meuVetorzinho[1] = 1;
		for(int i = 0; i < intervalo.length; i++) {
			int valorAtual = 0;
			if(i == 0 || i == 1) {
			continue;
			}
			//System.out.println(meuVetorzinho[1]);
			for( int j = 0; j < intervalo.length; j++) {
				valorAtual = intervalo[i] = intervalo[i] + intervalo[i-1];
				
				//valorAtual = meuVetorzinho[j] = meuVetorzinho[j-1]  + meuVetorzinho[j -2]   ;
			//System.out.println(intervalo[i]);
			 novoVetor[j] = valorAtual;
			}
			
		}
		
		System.out.println("O intervalo está até 19");
		int[] valorPadrao = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584};
		
		System.out.println("Digite um valor");
		int num = sc.nextInt();
	
		boolean valorLocalizado = valorPadrao.equals(num);
		
		for (int i = 0; i < valorPadrao.length; i++) {
			if(num == valorPadrao[i]) {
				System.out.println("Está dentro do intervalo da Fibo...");
			}
			}
		
		
			System.out.println("Valores dentro do intervalo");
			for(int variavel : valorPadrao) {
			System.out.print("[" + variavel + "] " );
			}
		
		
		
		
		
		
	}
	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	
	public Main() {
		super();

	}

}