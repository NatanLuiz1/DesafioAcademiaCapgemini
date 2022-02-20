package questao1;

//Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
//A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.


import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//criacao de variavel de entrada
		int n;
		
		//criacao de uma simples tratativa de exception
		try {
			System.out.println("Digite o número de entrada");
			n = leitor.nextInt();
			//criacao de um vetor para receber os characters
			String[] vetor = new String[n];
			String result= "";
			
			//criação dos laços de repetição para preenchimento do vetor
			for(int i = 0; i < n; i++) {
				vetor[i]=" ";
			}
			
			for (int j = vetor.length-1; j>=0; j--) {
				vetor[j] = "*";
				
				for(int x = 0; x<vetor.length;x++) {
					result += vetor[x];
				}
				//saida de dados
				System.out.println(result);
				result = "";
				
			}
		} catch (Exception e) {
			System.out.println("digite apenas números");
		}
		
		
		
		leitor.close();
		

	}

}
