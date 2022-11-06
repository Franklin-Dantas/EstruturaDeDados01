package LSE;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LSEProdutos listProdutos = new LSEProdutos();
        String codigo, nome;
        Produto produto;
        int op;
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
                    System.out.println("Digite o nome do produto: ");
                    nome = in.nextLine();
                    System.out.println("Digite o código do produto: ");
                    codigo = in.nextLine();
                    produto = new Produto(codigo, nome);
                    listProdutos.inserirProdutoInicio(produto);
                    break;
                case 2:
                    System.out.println("Digite o nome do produto: ");
                    nome = in.nextLine();
                    System.out.println("Digite o código do produto: ");
                    codigo = in.nextLine();
                    produto = new Produto(codigo, nome);
                    listProdutos.inserirProdutoFinal(produto);
                    break;
                case 3:
                    listProdutos.removerPrimeiro();
                    listProdutos.exibir();
                    break;
                case 4:
                    listProdutos.removerUltimo();
                    listProdutos.exibir();
                    break;
                case 5:
                    listProdutos.exibir();
                    break;
                case 6:
                    System.out.println("Digite o código do produto: ");
                    codigo = in.nextLine();
                    listProdutos.exibirProduto(codigo);
                    break;
                case 7:
                    System.out.println("Informe o nome do produto: ");
                    nome = in.nextLine();
                    listProdutos.alteraDados(nome);
                    listProdutos.exibir();
                    break;
                case 8:
                    System.out.println("Informe o nome do produto: ");
                    nome = in.nextLine();
                    listProdutos.removeProduto(nome);
                    listProdutos.exibir();
                    break;
            }

        } while (op != 0);
        in.close();
    }

    public static void menu() {
        System.out.println("Opções: ");
        System.out.println("1° Questão");
        System.out.println("1- Inserir um produto no início da lista");
        System.out.println("2- Inserir um produto no final da lista");
        System.out.println("3- Remover o primeiro produto da lista");
        System.out.println("4- Remover o último produto da lista");
        System.out.println("5- Exibir todos os produtos da lista");
        System.out.println("6- Exibir as informações de um produto especifico da lista");
        System.out.println("7- Alterar as informações de um produto da lista");
        System.out.println("8- Remover um dado produto");
        System.out.println("0- Sair do programa");
        System.out.println("Digite a opção desejada: ");
    }
}
