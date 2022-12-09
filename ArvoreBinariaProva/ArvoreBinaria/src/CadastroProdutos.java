import java.util.Scanner;

public class CadastroProdutos {
    Scanner in = new Scanner(System.in);
    private BinaryTree<Produto> Cadastro;

    public CadastroProdutos() {
        this.Cadastro = new BinaryTree<Produto>();
    }

    public void cadastrarProduto() {
        Produto produto;
        String id, descricao, fornecedor;
        double valor;
        int estoque;

        System.out.println("Informe o código:");
        id = in.nextLine();
        System.out.println("Nome do produto:");
        descricao = in.nextLine();
        System.out.println("Informe o fornecedor:");
        fornecedor = in.nextLine();
        System.out.println("Informe o valor:");
        valor = in.nextDouble();
        System.out.println("Informe o estoque:");
        estoque = in.nextInt();

        produto = new Produto(id, fornecedor, descricao, valor, estoque);
        this.Cadastro.inserirProduto(produto);
        System.out.println("Produto cadastrado com sucesso");
    }

    public void exibirProduto(String id) {
        Produto produto = procurar(id);
        if (produto == null)
            System.out.println("Produto não cadastro");
        else
            System.out.println(produto);
    }

    public void mostrarTodosProdutos() {
        this.Cadastro.ordenar();
    }

    public Produto procurar(String id) {
        Produto produto = new Produto(id);
        Produto prod;
        prod = Cadastro.buscar(produto);
        return prod;
    }

    public void alterarValor(String info) {
        double valor;
        Produto produto = procurar(info);
        if (produto == null)
            System.out.println("Produto não cadastro");
        else {
            System.out.println("Informe valor do novo preço desse produto:");
            valor = in.nextDouble();
            produto.setValor(valor);
        }
    }

    public void alterarEstoque(String id) {
        int estoque;
        Produto produto = procurar(id);
        if (produto == null)
            System.out.println("Produto não encontrado");
        else {
            System.out.println("Informe quantidade do estoque desse produto:");
            estoque = in.nextInt();
            produto.setEstoque(estoque);
        }
    }

    public void removerProduto(String id) {
        Produto produto = procurar(id);
        Cadastro.remove(produto);
    }
}