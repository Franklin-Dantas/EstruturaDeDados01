package ListaSimplismenteEncadeada;

public class LSEAluno {
    // metodos de insercao excluir e buscar
    private LSENode primeiro;

    public boolean isEmpty() {
        if (this.primeiro == null)
            return true;
        else
            return false;
    }

    public void exibir(){
        LSENode aux;

        if(this.isEmpty() == true){
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            //  loop para pegar o proximo e enquanto for diferente de null (chegar no final)
            while (aux != null){
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void inserirInicio(Aluno aluno) {
        LSENode novo = new LSENode(aluno);
        // se a lista estiver vazia
        if (isEmpty())
            this.primeiro = novo;
        // se não insere
        else {
            novo.setProx(this.primeiro);
            this.primeiro = novo;
        }
    }

    public void inserirFinal(Aluno aluno){
        LSENode ultimo = new LSENode(aluno);
        LSENode aux = this.primeiro;
        if(this.isEmpty()){
            this.primeiro = ultimo;
            return;
        }
        //  loop para pegar o proximo e enquanto for diferente de null (chegar no final)
        while(aux.getProx() != null){
            aux =  aux.getProx();
        }
        // insere ultimo
        aux.setProx(ultimo);
    }

    public void removeInicio() { 
        if (this.primeiro != null){
            this.primeiro = this.primeiro.getProx();
            return;
        }
    }

    public void removeFinal() {
        LSENode aux, penultimo = null;
        if (this.isEmpty() == true) // lista vazia
            System.out.println("Lista vazia!");
        else if (this.primeiro.getProx() == null) // lista com apenas um nó
            this.primeiro = null;
        else {
            aux = this.primeiro;
            //  loop para pegar o proximo e enquanto for diferente de null (chegar no final)
            while (aux.getProx() != null) {
                penultimo = aux;
                aux = aux.getProx();
            }
            System.out.println("Remoção efetuada!");
            penultimo.setProx(null);
        }
    }

}
