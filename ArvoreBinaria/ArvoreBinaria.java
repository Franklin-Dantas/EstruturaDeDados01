package ArvoreBinaria;

public class ArvoreBinaria<T extends Comparable<T>> {
    private arvoreNode<T> raiz;

    public void inserir(T info) {
        arvoreNode<T> node = new arvoreNode<>(info);
        if (this.isEmpty())
            this.raiz = node;
        else
            this.raiz.inserir(info);
    }

    public void ordenar() {
        if (this.isEmpty())
            System.out.println("Arvore vazia");
        else
            percorrerOrdenado(this.raiz);
    }

    private void percorrerOrdenado(arvoreNode<T> raiz) {
        if (raiz != null) {
            percorrerOrdenado(raiz.getEsquerda());
            System.out.println(raiz.getInfo());
            percorrerOrdenado(raiz.getDireita());
        }
    }

    public boolean isEmpty() {
        if (this.raiz == null)
            return true;
        else
            return false;
    }

    public arvoreNode<T> getRaiz() {
        return this.raiz;
    }

    public void setRaiz(arvoreNode<T> raiz) {
        this.raiz = raiz;
    }

}