package LSE.Question2e3;

public class LSENode {
    private Numero info;
    private LSENode prox;

    public LSENode (Numero valor){
        this.info = valor;
    }

    public void setInfo(Numero valor){
        this.info = valor;
    }

    public void setProx(LSENode prox){
        this.prox = prox;
    }

    public Numero getInfo(){
        return this.info;
    }

    public LSENode getProx(){
        return this.prox;
    }
}
