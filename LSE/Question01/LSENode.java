package LSE.Question01;

public class LSENode {

    private Produto info;
    private LSENode prox;

    public LSENode (Produto info){
        this.info = info;
    }

    public void setInfo(Produto info){
        this.info = info;
    }

    public void setProx(LSENode prox){
        this.prox = prox;
    }

    public Produto getInfo(){
        return this.info;
    }

    public LSENode getProx(){
        return this.prox;
    }
}
