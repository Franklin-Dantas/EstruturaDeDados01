package ArvoreBinaria;

public class arvoreNode<T extends Comparable<T>> {
    private arvoreNode<T> esquerda;
    private arvoreNode<T> direita;
    private T info;

    void inserir(T info) {
        arvoreNode<T> node = new arvoreNode<>(info);
        if (info.compareTo(this.getInfo()) == 0) {
            System.out.println("Valor repetido!");
            return;
        } else if (info.compareTo(this.getInfo()) < 0) {
            if (this.esquerda == null) 
                this.esquerda = node;
            else 
                this.esquerda.inserir(info);
        } else {
            if (this.direita == null) 
                this.direita = node;
            else 
                this.direita.inserir(info);
        }
    }

    public arvoreNode(T info) {
        this.info = info;
    }

    public T getInfo() {
        return this.info;
    }

    public arvoreNode<T> getEsquerda() {
        return this.esquerda;
    }

    public arvoreNode<T> getDireita() {
        return this.direita;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public void setEsquerda(arvoreNode<T> node) {
        this.esquerda = node;
    }

    public void setDireita(arvoreNode<T> node) {
        this.direita = node;
    }

}