package LSESemRepeticao;

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
                case 0:
                    System.out.println("Encerrando...");
                    break;
                    case 1: System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    System.out.print("Informe o nome do aluno: ");
                    nome = in.nextLine();
                    aluno = new Aluno (matr, nome);
                    turma.inserirInicio(aluno);
                    break;
            case 2: System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    System.out.print("Informe o nome do aluno: ");
                    nome = in.nextLine();
                    aluno = new Aluno (matr, nome);
                    turma.inserirFinal(aluno);
                    break;
            case 3: turma.exibirTodos();
                    break;
            case 4: System.out.println("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.exibirAluno(matr);
                    break;
            case 5: System.out.println("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.alteraMedia(matr);
                    break;
            case 6: System.out.println("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.alteraFaltas(matr);
                    break;
            case 7: System.out.println("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.removeUmAluno(matr);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 0);
        in.close();
    }

    public static void menu() {
        System.out.println("1 - Inserir no início");
        System.out.println("2 - Inserir no final");
        System.out.println("3 - Exibir todos");
        System.out.println("4 - Exibir um aluno específico");
        System.out.println("5 - Alterar média");
        System.out.println("6 - Alterar faltas");
        System.out.println("7 - Remover um aluno");
        System.out.println("0 - Sair");
        System.out.print("Opção: ");
    }
}
