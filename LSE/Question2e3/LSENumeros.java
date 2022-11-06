package LSE.Question2e3;

public class LSENumeros {
    LSENode primeiro;

    public boolean isEmpty() {
        if (this.primeiro == null)
            return true;
        else
            return false;
    }

    public void removerDuplicados(int valor) {
        if (this.isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }
        LSENode anterior = null;
        LSENode atual = this.primeiro;
        LSENode proximo = atual.getProx();
        int cont = 0;

        if (proximo == null) {
            if (atual.getInfo().getNumber() == valor) {
                atual = null;
                cont++;
            }
        }
        while (proximo != null) {
            boolean breakPoint = false;
            if (atual.getInfo().getNumber() == valor) {
                cont++;
                breakPoint = true;
            } else {
                breakPoint = false;
                atual = atual.getProx();
            }
            proximo = atual != null && breakPoint ? atual.getProx() : atual != null ? atual : null; //se atual é null, proximo também é null
            if (breakPoint) {
                if (anterior != null) {
                    anterior.setProx(proximo);
                } else {
                    this.primeiro = proximo;
                }
                atual = proximo;
            }
        }
        System.out.println(String.format("Foram removidos %s items", cont));
    }

    public LSENumeros somaListas(LSENumeros lista1, LSENumeros lista2) {
        LSENumeros lista3 = new LSENumeros();
        LSENode aux1 = lista1.primeiro;
        LSENode aux2 = lista2.primeiro;
        LSENode aux3 = null;

        do {
            int valorA = 0;
            int valorB = 0;

            if (aux1 != null) 
                valorA = aux1.getInfo().getNumber();

            if (aux2 != null) 
                valorB = aux2.getInfo().getNumber();

            Numero soma = new Numero(valorA + valorB);
            LSENode nodeC = new LSENode(soma);
            if (lista3.primeiro == null) {
                lista3.primeiro = nodeC;
                aux3 = nodeC;
            } else {
                aux3.setProx(nodeC);
                aux3 = nodeC;
            }

            aux1 = aux1 != null ? aux1.getProx() : null;// teste pra ver se aux1 = aux1.getProx();
            aux2 = aux2 != null ? aux2.getProx() : null;// teste pra ver se aux2 = aux2.getProx();

        } while (aux1 != null || aux2 != null);//enquanto a lista 1 ou 2 não acabarem.
        return lista3;
    }
}