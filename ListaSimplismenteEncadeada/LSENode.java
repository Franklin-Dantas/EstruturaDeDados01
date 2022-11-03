package ListaSimplismenteEncadeada;

public class LSENode {

    private Aluno info;
    private LSENode prox;

    public LSENode(Aluno info) {
        this.info = info;
    }

    // metodos get e set
    public Aluno getInfo() {
        return info;
    }

    public void setInfo(Aluno info) {
        this.info = info;
    }

    public LSENode getProx() {
        return prox;
    }

    public void setProx(LSENode prox) {
        this.prox = prox;
    }

}