package questao3;

//Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas
//para formar a outra palavra.Dada uma string qualquer, desenvolva um algoritmo que encontre o n�mero de pares de substrings
//que s�o anagramas.


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//declara��o de vari�veis e do hashmap
		System.out.println("Digite a palavra a ser analisada: ");	
		String palavra = leitor.next();
		HashMap<String, Integer> list = new HashMap<>();
		int contador = 0;
		
		
		//cria��o dos la�os de repeti��o para percorrer a palavra e aloc�-las dentro de um array
		for(int i = 0; i <= palavra.length(); i++ ) {
			for(int y = i; y < palavra.length(); y++) {
				char[] letras = palavra.substring(i, y+1).toCharArray();
				Arrays.sort(letras);
				String testePalavra = new String(letras);
				if(list.containsKey(testePalavra)) {list.put(testePalavra, list.get(testePalavra)+1);}
				else
					list.put(testePalavra, 1);
			}
		}
		// cria��o do la�o para fazer a contagem de palavras anagramas
		for(String verificador : list.keySet()) {
			int marcador = list.get(verificador);
			contador = contador + ((marcador -1)*marcador/2);
		}
		//saida de dados
		System.out.println(contador);
		leitor.close();

	}

}
