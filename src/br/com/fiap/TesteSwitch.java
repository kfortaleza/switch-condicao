package br.com.fiap;

import java.util.Scanner;

import br.com.fiap.aluno.Aluno;

public class TesteSwitch {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int opcao;

		System.out.println("Digite um número inteiro de 1 a 5: ");

		opcao = leitor.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Você escolheu 1!");
			break;
		case 2:
			System.out.println("Você escolheu 2!");
			break;
		case 3:
			System.out.println("Você escolheu 3!");
			break;
		case 4:
			System.out.println("Você escolheu 4!");
			break;
		case 5:
			System.out.println("Você escolheu 5!");
			break;
		default:
			System.out.println("Escolha errada!");

		}
		
		System.out.println("Fim!");

	}

}
