public class BinaryTree<T extends Comparable<T>> {
    private TreeNode<T> raiz;

    public boolean isEmpty() {
        if (this.raiz == null)
            return true;
        else
            return false;
    }

    public T buscar(T info) {
        if (this.isEmpty() == true)
            return null;
        else
            return this.raiz.buscarNode(info);
    }

    public void ordenar() {
        if (this.isEmpty())
            System.out.println("Nenhum produto cadastrado.");
        else
            percorerArvore(this.raiz);
    }

    public void inserirProduto(T info) {
        TreeNode<T> NodeA = new TreeNode<>(info);
        if (this.isEmpty())
            this.raiz = NodeA;
        else
            this.raiz.inserirArvore(info);
    }
    
    private void percorerArvore(TreeNode<T> raiz) {//ordena de forma crescente
        if (raiz != null) {
            percorerArvore(raiz.getEsquerda());
            System.out.println(raiz.getInfo());
            percorerArvore(raiz.getDireita());
        }
    }

    public void inserir(T info) {
        TreeNode<T> aux, novaRaiz;
        aux = this.raiz;
        novaRaiz = new TreeNode<>(info);
        if (this.isEmpty()) {
            this.raiz = novaRaiz;
            return;
        }
        while (true) {
            if (info.compareTo(aux.getInfo()) == 0) {
                System.out.println("Ja existe esse produto.");
                break;
            } else if (info.compareTo(aux.getInfo()) < 0) {
                if (aux.getEsquerda() != null) 
                    aux = aux.getEsquerda();
                 else 
                    aux.setEsquerda(novaRaiz);
                    break;
            } else {
                if (aux.getDireita() != null) 
                    aux = aux.getDireita();
                 else 
                    aux.setDireita(novaRaiz);
                    break;
            }
        }
    }

    public void remove(T info) {
        if (this.isEmpty())
            System.out.println("Arvore vazia");
        else
            this.raiz = this.removeNode(this.raiz, info);
    }

    TreeNode<T> removeNode(TreeNode<T> raiz, T info) {
        if (raiz != null) {
            if (info.compareTo(raiz.getInfo()) == 0) {
                TreeNode<T> superior, inferior;
                if (raiz.getEsquerda() == null && raiz.getDireita() == null)
                    raiz = null;
                else if (raiz.getDireita() == null)
                    raiz = raiz.getEsquerda();
                else if (raiz.getEsquerda() == null)
                    raiz = raiz.getDireita();
                else {
                    superior = raiz;
                    inferior = raiz.getEsquerda();
                    while (inferior.getDireita() != null) {
                        superior = inferior;
                        inferior = inferior.getDireita();
                    }
                    superior.setDireita(inferior.getEsquerda());
                    raiz.setInfo(inferior.getInfo());
                }
            } else if (info.compareTo(raiz.getInfo()) < 0)
                raiz.setEsquerda(removeNode(raiz.getEsquerda(), info));
            else
                raiz.setDireita(removeNode(raiz.getDireita(), info));
        }
        return raiz;
    }

    // Getters - Setters
    public TreeNode<T> getRaiz() {
        return this.raiz;
    }

    public void setRaiz(TreeNode<T> root) {
        this.raiz = root;
    }
}