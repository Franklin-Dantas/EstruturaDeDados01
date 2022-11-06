package LSE;

public class Produto implements Comparable <Produto>{

    private String id;
    private String descricao;
    private double valor;
    private int estoque;

    public Produto (String id){
        this.id = id;
    }

    public Produto (String id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }
    
    public Produto (String id, String descricao, double valor, int estoque){
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
    }

    public void setId (String id){
        this.id = id;
    }

    public void setDescricao (String descricao){
        this.descricao = descricao;
    }

    public void setValor (double valor){
        this.valor = valor;
    }

    public void setEstoque (int estoque){
        this.estoque = estoque;
    }

    public String getId(){
        return id;
    }

    public String getdescricao(){
        return descricao;
    }

    public Double getValor(){
        return valor;
    }

    public int getEstoque(){
        return estoque;
    }

    @Override
    public int compareTo (Produto pr){
        int result;
        result = this.getId().compareTo(pr.getId());
        return result;
    }

    @Override
    public String toString(){
        return this.id + " " + this.descricao + " " + this.valor + " " + this.estoque;
    }

}