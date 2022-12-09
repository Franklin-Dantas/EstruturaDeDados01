public class Produto implements Comparable<Produto> {

    private String id;
    private String descricao;
    private String fornecedor;
    private double valor;
    private int estoque;

    @Override
    public String toString() {
        return "\nId: " + id +
                "\nDescrição: " + descricao +
                "\nFornecedor: " + fornecedor +
                "\nValor: " + valor +
                "\nEstoque: " + estoque;
    }

    @Override
    public int compareTo(Produto produto) {
        return this.getId().compareTo(produto.getId());
    }

    // Construtores
    public Produto(String id) {
        this.id = id;
    }

    public Produto(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Produto(String id, String descricao, String fornecedor, double valor, int estoque) {
        this.id = id;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.valor = valor;
        this.estoque = estoque;
    }

    // Getters - Setters
    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}