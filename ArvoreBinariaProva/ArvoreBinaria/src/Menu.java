import java.util.Scanner;

public class Menu {

    public static void menu() {
        System.out.println("|-------------------------------------|");
        System.out.println("| Opção 1 - Cadastrar produto         |");
        System.out.println("| Opção 2 - Mostrar todos produtos    |");
        System.out.println("| Opção 3 - Procurar por produto      |");
        System.out.println("| Opção 4 - Alterar valor produtos    |");
        System.out.println("| Opção 5 - Alterar estoque produtos  |");
        System.out.println("| Opção 6 - Remover produto           |");
        System.out.println("| Opção 0 - Sair                      |");
        System.out.println("| Digite uma opção valida:            |");
        System.out.println("|-------------------------------------|");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CadastroProdutos listaProdutos = new CadastroProdutos();
        String id;
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
                    listaProdutos.cadastrarProduto();
                    break;
                case 2:
                    listaProdutos.mostrarTodosProdutos();
                    break;
                case 3:
                    System.out.println("Informe o id do produto:");
                    id = in.nextLine();
                    listaProdutos.exibirProduto(id);
                    break;
                case 4:
                    System.out.println("Informe o id do produto:");
                    id = in.nextLine();
                    listaProdutos.alterarValor(id);
                    break;
                case 5:
                    System.out.println("Informe o id do produto:");
                    id = in.nextLine();
                    listaProdutos.alterarEstoque(id);
                    break;
                case 6:
                    System.out.println("Informe o id do produto:");
                    id = in.nextLine();
                    listaProdutos.removerProduto(id);
                    break;
            }

        } while (op != 0);
        in.close();
    }
}