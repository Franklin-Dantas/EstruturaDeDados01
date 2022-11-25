package LDECirculare.LDECircular.src;

public class LDECNode<T extends Comparable<T>> {
    private LDECNode<T> anterior;
    private LDECNode<T> proximo;
    private T info;

    public LDECNode(T valor) {
        this.info = valor;
    }

    public void setAnterior(LDECNode<T> novoAnterior) {
        this.anterior = novoAnterior;
    }
    
    public void setProximo(LDECNode<T> novoProximo) {
        this.proximo = novoProximo;
    }

    public void setInfo(T valor) {
        this.info = valor;
    }

    public LDECNode<T> getAnt() {
        return this.anterior;
    }

    public LDECNode<T> getProx() {
        return this.proximo;
    }

    public T getInfo() {
        return this.info;
    }
}