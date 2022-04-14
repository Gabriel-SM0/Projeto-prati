package geral;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int numero;
		double notaFinal;
		String entradaData = "0";
		String classificacao = "a";

		Scanner entrada = new Scanner(System.in);
		Scanner entradaPData = new Scanner(System.in);

		ArrayList<Pessoa> lista = new ArrayList<>();

		int opcao = 10;
		while (opcao != 0) {
			menu();
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Diga o nome do usuário: ");
				nome = entrada.next();
				System.out.println("Diga o telefone do usuário: ");
				numero = entrada.nextInt();
				System.out.println("Diga a data de nascimento do usuário: no formato dd/MM/yyyy ");
				entradaData = entradaPData.nextLine();
				String[] valores = entradaData.split("/");
				int[] dataInt = new int[3];
				dataInt[0] = Integer.parseInt(valores[0]);
				dataInt[1] = Integer.parseInt(valores[1]);
				dataInt[2] = Integer.parseInt(valores[2]);

				LocalDate DataNasc = LocalDate.of(dataInt[2], dataInt[1], dataInt[0]);

				System.out.println("O usuário é aluno? (S ou N)");
				classificacao = entrada.next();
				if (classificacao.equals("S") || classificacao.equals("s")) {
					System.out.println("Digite a nota final do curso: ");
					notaFinal = entrada.nextDouble();

					Aluno usuario = new Aluno(nome, numero, DataNasc, notaFinal);

					lista.add(usuario);

				} else {

					Pessoa usuario = new Pessoa(nome, numero, DataNasc);

					lista.add(usuario);
				}

				continue;

			case 2:
				System.out.println("Nomes de todos os usuários: ");
				for(Pessoa elemento: lista) {
					System.out.println(elemento.toString());
				}
				
				
				continue;
			case 3:
				System.out.println("3");
				continue;
			case 4:
				System.out.println("4");
				continue;
			case 0:
				System.out.println("Encerrando programa.");
				break;

			}
		}

		/*
		 * int a = entrada.nextInt(); System.out.println(a);
		 */
	}

	public static void menu() {
		System.out.println();
		System.out.println("---Menu---");
		System.out.println("Escolha a opção:");
		System.out.println("1 - Criar usuário.");
		System.out.println("2 - Mostrar todos os usuários.");
		System.out.println("3 - Atualizar usuário.");
		System.out.println("4 - Deletar usuário.");
		System.out.println("0 - Encerrar programa.");
		System.out.println();

	}

}
