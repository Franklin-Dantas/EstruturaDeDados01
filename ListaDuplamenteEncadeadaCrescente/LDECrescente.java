
//lista duplamente encadeada ordenada em ordem crescente
public class LDECrescente <T extends Comparable <T>> {
    private LDENode<T> primeiro;
    private LDENode<T> ultimo;
    private int qtd;

    public boolean isEmpty(){
        if(this.qtd == 0)
        return true;
        else 
        return false;
    }


    public void inserir (T valor){
        LDENode<T> novo = new LDENode(valor);
        LDENode<T> aux ,anterior;
        //inserindo na lista vazia
        if( this.isEmpty() == true){
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd ++;
        }
        //testando pra ver se é menor q o primeiro
        else if (valor.compareTo(this.primeiro.getInfo()) < 0){
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd ++;
        }
        //testando pra ver se é igual o primeiro
        else if (valor.compareTo(this.primeiro.getInfo()) == 0){
            System.out.println("Valor repetido insercao n efedtuada");
        }
        //testando pra ver se é maior q o ultimo
        else if (valor.compareTo(this.ultimo.getInfo()) > 0){
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
        }      
        //testando pra ver se é igual o ultimo  
        else if (valor.compareTo(this.ultimo.getInfo()) == 0){
            System.out.println("Valor repetido insercao n efedtuada");
        }
        //inserindo no meio
        else {
            aux = this.primeiro.getProx();
            while(true){//não importa a logica
                if(valor.compareTo(aux.getInfo()) == 0){
                    System.out.println("Valor repetido insecao n efetuada");
                    break;
                }
                else if (valor.compareTo(aux.getInfo()) < 0){//achei local de insercao
                    anterior = aux.getAnt();
                    anterior.setProx(novo);
                    aux.setAnt(novo);
                    novo.setProx(aux);
                    novo.setAnt(anterior);
                    this.qtd++;
                    break;
                }else
                aux = aux.getProx();
            }
        }
    }
}
