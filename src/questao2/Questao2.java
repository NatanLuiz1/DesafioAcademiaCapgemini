package questao2;

//Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte.
//Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser 
//adicionados para uma string qualquer ser considerada segura.

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);				
		// criação da variável para receber o dado de entrada
		String senha;
		
		//recebimento da variável de entrada
		System.out.println("Digite a senha: ");
		senha = leitor.next();
		//calculo da quantidade de caracters que faltam para ter uma senha segura
		if(senha.length()<6) System.out.println(6-senha.length());
		
		else System.out.println("Senha segura!");
		
		leitor.close();

	}

}
