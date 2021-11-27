import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Utilizei o nome do M�todo fora do padr�o camel case.
		Scanner sc = new Scanner(System.in);
		
		
		
	System.out.println("Digite o n�mero do Exerc�cio");
	int numeroDesafio = sc.nextInt();
	
	switch(numeroDesafio) {
	
	case 1:
		System.out.println("Resultado do Primeiro Exerc�cio: \n");
		One();
		break;
	case 2: 
		System.out.println("Resultado do Segundo Exerc�cio: \n");
		Two();
		break;
	case 3:
		System.out.println("Resultado do Terceiro Exerc�cio: \n");
		Three();
		break;
	case 4:
		System.out.println("Resultado do Quarto Exerc�cio \n");
		Four();
	break;
	case 5:
		System.out.println("Resultado do Quinto Exerc�cio \n");
		Five();
		break;
	default:
		System.out.println("De 1 a 5, Encerrando o programa.");
		Runtime.getRuntime().exit(0);
		break;
	}
	
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
		
		System.out.println("O intervalo est� at� 19");
		int[] valorPadrao = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584};
		
		System.out.println("Digite um valor");
		int num = sc.nextInt();
	
		boolean valorLocalizado = valorPadrao.equals(num);
		
		for (int i = 0; i < valorPadrao.length; i++) {
			if(num == valorPadrao[i]) {
				System.out.println("Est� dentro do intervalo da Fibo...");
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
	public static void Three() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor de entrada(Qtd de Repeti��es)");
		int valorEntrada = sc.nextInt();
		System.out.println("A) Somente �mpares");
		
		int count = 1;
		int[] resultadoImpar = new int[valorEntrada];
		
		while(count < valorEntrada) {
			
			if(count % 2 == 1) {
				for (int i = 0; i < resultadoImpar.length; i++) {
					resultadoImpar[i] += count;
					count += 2;	
				}
			
			}
			
			for(int i = 0; i < resultadoImpar.length; i++) {
				System.out.print("[" + resultadoImpar[i] + "] ");
			}
			
		}
		
		System.out.println();
		System.out.println("B) Dobro do Anterior e Par");
		
		count = 2;
		int[] resultadoPar = new int[valorEntrada];
			
		for( int i = 0; i < valorEntrada; i ++) {
			if( count % 2 == 0) {
				resultadoPar[i] += count;							
			}
			count *= 2;
			
			
		}
		
		for(int i = 0; i < resultadoPar.length; i++) {
		    System.out.print("[" + resultadoPar[i] + "] ");
		}

		
		System.out.println();
		System.out.println("C)N�meros Quadrados ");
		
		count = 0;
		int[] resultadoSequenciais = new int[valorEntrada];
		for(int i = 0; i < valorEntrada; i++) {
			resultadoSequenciais[i] = i * i;
		}
		
		for(int i = 0; i < resultadoSequenciais.length; i++) {
		    System.out.print("[" + resultadoSequenciais[i] + "] ");
		}
		
		System.out.println();
		System.out.println("D) N�meros Elevados ");
		
		count = 4;
		int[] resultadoElevados = new int[valorEntrada];
		
		for (int i = 0; i < valorEntrada; i++) {
			if(i ==0 ) {
				resultadoElevados[i] = 4;
				continue;
			}
			resultadoElevados[i] = count+(8*i) + resultadoElevados[i-1];			
		}
		
		for(int i = 0; i < resultadoElevados.length; i++) {
		    System.out.print("[" + resultadoElevados[i] + "] ");
		}
		
		System.out.println();
		System.out.println("E) Soma dos anteriores ");
		
		count = 0;
		int[] resultadoAnteriores = new int[valorEntrada];
		
		for (int i = 0; i < valorEntrada; i++) {
			if(i == 0 || i == 1) {
				resultadoAnteriores[i] = 1;
				continue;
			}
			
			resultadoAnteriores[i] = (resultadoAnteriores[i-2] + resultadoAnteriores[i -1]);
		}
		
		for(int i = 0; i < resultadoAnteriores.length; i++) {
		    System.out.print("[" + resultadoAnteriores[i] + "] ");
		}
		
		
		System.out.println();
		System.out.println("F) Famoso D ");
		
		
		
		int resultadoDEntrada[] = new int[valorEntrada];
		int[] resultadoD = {2,10,12,16,17,18,200};
		
		if(valorEntrada <= 7) {
			
			for (int i = 0; i < valorEntrada; i++) {
				resultadoDEntrada[i] += resultadoD[i];
			}
		}else {
				
			System.out.println(Arrays.toString(resultadoD));
		
		}
		if(valorEntrada <= 7) {
		System.out.println(Arrays.toString(resultadoDEntrada));
		}
		/*for(int i = 0; i < valorEntrada; i++) {
			System.out.print("[" + resultadoDEntrada[i] + "] ");
		}*/
			
		
				
			
			
			
		
		
	}
	public static void Four() {
		car carro = new car();
		Truck caminhao = new Truck();
		
		
		carro.setVelocidade((short) 110);
		caminhao.setVelocidade((short) 80);
		
		System.out.println("Velocidade do Caminh�o: " + caminhao.getVelocidade() + "km/h");
		
		System.out.println("Velocidade do Carro: "+ carro.getVelocidade() + "km/h");
		System.out.println("O percurso ser� de 100km\n");
		System.out.println("O Tempo m�dio do carro e do caminh�o para concluir a viagem ser� de: ");
		
		int percurso = 100;
		int hora = 60;
		float tempoMedioCarro = (float)(percurso * hora) / carro.getVelocidade();
		double tempoMedioCaminhao =(double) (percurso * hora) / caminhao.getVelocidade();
		
		System.out.printf("Carro: %.2f em minutos\n", tempoMedioCarro);
		System.out.printf("Caminh�o %.2f em minutos\n",tempoMedioCaminhao);
		
		System.out.println("\nVamos acrescentar dois ped�gios no percurso do caminh�o, ");
		tempoMedioCaminhao += 10;
		System.out.println("Levar� 5 minutos em cada ped�gio o resultado �: " + tempoMedioCaminhao);
		//MMC deles 1760 minutos
		System.out.println("Vamos realizar o MMC de ambos, 110 e 85");
		int mmcAmbos = 1870;
		mmcAmbos = mmcAmbos  / 60;
		System.out.println("\nEm "+ mmcAmbos + " minutos se encontrar�o");
		System.out.print("A dist�ncia percorrida pelo carro neste tempo ser� de:");
		
		float tempoGastoCarro = carro.getVelocidade() * mmcAmbos / 60;
		System.out.println(tempoGastoCarro+ "km");
		
		System.out.printf("E do Caminh�o ser� de: ");
		double tempoGastoCaminhao = caminhao.getVelocidade() * mmcAmbos / 60;
		System.out.println(tempoGastoCaminhao+ "km");
		
		System.out.println("Agora se subtrairmos iremos ter o ve�culo mais pr�ximo de RP");
		System.out.println("O Carro est� a dist�ncia de 56 km longe de RP");
		System.out.println("J� o Caminh�o est� a dist�ncia de: " + (100-41)+ "km");
		System.out.println("Conclus�o o carro � o mais pr�ximo\n\n\n\n");
		
		System.out.println("(Obs: minhas skills de math n�o s�o l������� aquelas coisas.... mas, topo sempre melhorar, Abra�os!)");
	
		
		
	
		
		
	}
	public static void Five() {

		Scanner sc = new Scanner (System.in);
		System.out.println("Digite qualquer palavra");
		String guardeiSuaPalavra = sc.nextLine();
		
		ArrayList <String> listaDeLetras = new ArrayList<>();
		System.out.println();
		// 
		
	
	}
	
	
	public Main() {
		super();

	}

}