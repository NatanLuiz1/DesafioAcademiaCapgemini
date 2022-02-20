package questao2;

//D�bora digitou uma string aleat�ria no campo de senha, por�m ela n�o tem certeza se � uma senha forte.
//Para ajudar D�bora, construa um algoritmo que informe qual � o n�mero m�nimo de caracteres que devem ser 
//adicionados para uma string qualquer ser considerada segura.

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);				
		// cria��o da vari�vel para receber o dado de entrada
		String senha;
		
		//recebimento da vari�vel de entrada
		System.out.println("Digite a senha: ");
		senha = leitor.next();
		//calculo da quantidade de caracters que faltam para ter uma senha segura
		if(senha.length()<6) System.out.println(6-senha.length());
		
		else System.out.println("Senha segura!");
		
		leitor.close();

	}

}
