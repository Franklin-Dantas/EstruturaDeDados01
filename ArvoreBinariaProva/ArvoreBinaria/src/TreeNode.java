public class TreeNode<T extends Comparable<T>> {
    private TreeNode<T> esquerda;
    private TreeNode<T> direita;
    private T info;

    public TreeNode(T info) {
        this.info = info;
    }

    void inserirArvore(T info) {
        TreeNode<T> NodeA = new TreeNode<>(info);
        if (info.compareTo(this.getInfo()) == 0) {
            System.out.println("Produto ja inserido.");
        } else if (info.compareTo(this.getInfo()) > 0) { // Teste maior
            if (this.direita == null)
                this.direita = NodeA;
            else
                this.direita.inserirArvore(info);
        } else {
            if (this.esquerda == null)
                this.esquerda = NodeA;
            else
                this.esquerda.inserirArvore(info);
        }
    }

    T buscarNode(T info) {
        if (info.compareTo(this.getInfo()) == 0)
            return this.getInfo();
        else if (info.compareTo(this.getInfo()) > 0) { // Teste maior
            if (this.getDireita() == null)
                return null;
            else
                return this.getDireita().buscarNode(info);
        } else {
            if (this.getEsquerda() == null)
                return null;
            else
                return this.getEsquerda().buscarNode(info);
        }
    }

    // Getters - Setters
    public T getInfo() {
        return this.info;
    }

    public TreeNode<T> getEsquerda() {
        return this.esquerda;
    }

    public TreeNode<T> getDireita() {
        return this.direita;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public void setEsquerda(TreeNode<T> NodeA) {
        this.esquerda = NodeA;
    }

    public void setDireita(TreeNode<T> NodeA) {
        this.direita = NodeA;
    }

}