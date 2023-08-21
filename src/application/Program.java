package application;

import java.util.Scanner;

import entities.Iphone;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Iphone iphone = new Iphone("iPhone", "iPhone 13 PRO");

		System.out.println("Ligando o aparelho...");
		iphone.setLigado(true);
		System.out.println("Aparelho ligado!");

		System.out.println("Qual operação deseja realizar?");
		System.out.println("Digite 1 para tocar musica;\n" + "Digite 2 para pausar a musica;\n"
				+ "Digite 3 para trocar a musica;\n" + "Digite 4 para fazer uma ligação;\n"
				+ "Digite 5 para atender uma ligação;\n" + "Digite 6 para iniciar o correio de voz;\n"
				+ "Digite 7 para navegar na internet em uma pagina expecífica;\n"
				+ "Digite 8 para adicionar uma nova aba;\n" + "Digite 9 para atualizar a pagina;\n"
				+ "Digite 0 para desligar o aparelho.");
		
		int opcao = sc.nextInt();

		do {
			switch (opcao) {
			case 1:
				System.out.println("Tocando música...");

				break;
			case 2:
				System.out.println("Música pausada...");

				break;
			case 3:
				System.out.print("Digite o nome da musica que deseja ouvir: ");
				sc.nextLine();
				String musica = sc.nextLine();
				System.out.println("Tocando " + musica);

				break;
			case 4:
				System.out.print("Digite o numero de celular que deseja ligar: ");
				sc.nextLine();
				String numero = sc.nextLine();
				System.out.println("Ligando para " + numero);

				break;
			case 5:
				System.out.println("Atendendo a ligação...");

				break;
			case 6:
				System.out.println("Iniciando correio de voz...");

				break;
			case 7:
				System.out.print("Digite a URL da página que deseja acessar: ");
				sc.nextLine();
				String url = sc.nextLine();
				System.out.println("Acessando " + url);

				break;
			case 8:
				System.out.println("Adicionando nova aba...");

				break;
			case 9:
				System.out.println("Atualizando a página...");

				break;
			case 0:
				System.out.println("Desligando o aparelho...");
				
				iphone.setLigado(false);
				opcao = 10;
				
				break;
			default:
				System.out.println("Opção inválida, tente novamente.");

				break;
			}
			
			if(opcao != 10) {
			System.out.println("\nDigite o numero de uma nova operação quando quiser: \n");
			opcao = sc.nextInt();
			}
			
		} while (opcao != 10);

		sc.close();
	}
}
