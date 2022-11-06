package ListaSimplismenteEncadeada;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LSEAluno turma = new LSEAluno();
        String nome, matr;
        Aluno aluno;
        int op;

        // menu
        do {
            menu();
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                default:
                    System.out.println("Opção inválida!");
                case 0:
                    System.out.println("Encerrando...");
                    break;
                case 1:
                    System.out.println("Informe o nome do aluno: ");
                    nome = in.nextLine();
                    System.out.println("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    aluno = new Aluno(nome, matr);
                    turma.inserirInicio(aluno);
                    break;
                case 2:
                    turma.removeInicio();
                    break;
                case 3:
                    System.out.println("Informe o nome do aluno: ");
                    nome = in.nextLine();
                    System.out.println("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    aluno = new Aluno(nome, matr);
                    turma.inserirFinal(aluno);
                    break;
                case 4:
                    turma.removeFinal();
                    break;
                case 5:
                    turma.exibir();
                    break;
            }
        } while (op != 0);
        in.close();
    }

    public static void menu() {
        System.out.println("Escolha uma das opções: ");
        System.out.println("1 - Inserir no início");
        System.out.println("2 - Remover do início");
        System.out.println("3 - Inserir no final");
        System.out.println("4 - Remover do final");
        System.out.println("5 - Exibir");
        System.out.println("0 - Sair");
        System.out.println("Opção: ");
    }

}
