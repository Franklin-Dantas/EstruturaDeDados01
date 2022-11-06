package LSE;

import java.util.Scanner;

public class LSEProdutos {

    private LSENode primeiro;

    public boolean isEmpty() {
        if (this.primeiro == null)
            return true;
        else
            return false;
    }

    private LSENode buscar(Produto produto) {
        LSENode aux;
        if (this.isEmpty() == true)
            return null;
        else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().compareTo(produto) == 0)
                    return aux;
                else
                    aux = aux.getProx();
            }
            return null;
        }
    }

    public void exibir() {
        LSENode aux;
        if (this.isEmpty() == true)
            System.out.println("Lista vazia!");
        else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void exibirProduto(String id) {
        Produto aux = new Produto(id);
        LSENode result = this.buscar(aux);

        if (result != null) {
            System.out.println("Informações do Produto: ");
            System.out.println(result.getInfo());
        } else
            System.out.println("Produto não cadastrado!");
    }

    public void inserirProdutoInicio(Produto produto) {
        LSENode result = this.buscar(produto);
        LSENode novoProduto;

        if (result != null)
            System.out.println("Produto já cadastrado!");
        else {
            novoProduto = new LSENode(produto);
            if (this.isEmpty() == true)
                this.primeiro = novoProduto;
            else {
                novoProduto.setProx(this.primeiro);
                this.primeiro = novoProduto;
            }
            System.out.println("Produto cadastrado!");
        }
    }

    public void inserirProdutoFinal(Produto produto) {
        LSENode result = this.buscar(produto);
        LSENode novoProduto, aux;

        if (result != null)
            System.out.println("Produto já cadastrado!");
        else {
            novoProduto = new LSENode(produto);
            if (this.isEmpty() == true)
                this.primeiro = novoProduto;
            else {
                aux = this.primeiro;
                while (aux.getProx() != null) {
                    aux = aux.getProx();
                }
                aux.setProx(novoProduto);
            }
            System.out.println("Produto cadastrado!");
        }
    }

    public void removerPrimeiro() {
        if (this.isEmpty() == true)
            System.out.println("Lista vazia!");
        else {
            primeiro = this.primeiro.getProx();
            System.out.println("Produto removido!");
        }
    }

    public void removerUltimo() {
        LSENode aux;
        if (this.isEmpty() == true)
            System.out.println("Lista vazia!");
        else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getProx() == null)
                    aux = null;
                else
                    aux = aux.getProx();
            }
        }
    }

    public void removeProduto(String id) {
        Produto aux = new Produto(id);
        LSENode atual, anterior;
        if (this.isEmpty() == true) 
            System.out.println("Lista vazia!");
        else if (this.primeiro.getProx() == null) {
            if (aux.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = null;
                System.out.println("Produto removido!");
            } else 
                System.out.println("Produto não esta cadastrado!");
        } else {
            if (aux.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = this.primeiro.getProx();
                System.out.println("Produto removido!");
            }
            anterior = null;
            atual = this.primeiro;
            while (atual != null) {
                if (atual.getInfo().compareTo(aux) != 0) {
                    anterior = atual;
                    atual = atual.getProx();
                } else
                    break;
            }
            if (atual == null) 
                System.out.println("Valor não encontrado!");
            else {
                anterior.setProx(atual.getProx());
                System.out.println("Produto removido!");
            }
        }
    }

    public void alteraDados(String id) {
        Scanner in = new Scanner(System.in);
        Produto aux = new Produto(id);
        LSENode result = this.buscar(aux);
        double novoValor;
        int qtdEstoque;

        if (result == null) 
            System.out.println("Produto não cadastrado!");
        else {
            System.out.println("Informe o valor do produto: ");
            novoValor = in.nextDouble();
            result.getInfo().setValor(novoValor);
            System.out.println("Informe o novo estoque: ");
            qtdEstoque = in.nextInt();
            result.getInfo().setEstoque(qtdEstoque);
        }
        in.close();
    }
}
