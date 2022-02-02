package br.com.fiap;

import java.util.Scanner;

import br.com.fiap.aluno.Aluno;

public class TesteSwitch {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int opcao;
		
		System.out.println("Digite um número inteiro de 1 a 5: ");
		
		opcao = leitor.nextInt();
		
		if (opcao == 1) {
			
			System.out.println("Você escolheu 1!");
		} 

	}

}
