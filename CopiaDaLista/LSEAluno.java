package CopiaDaLista;

import java.util.Scanner;

public class LSEAluno {
    // metodos de insercao excluir e buscar
    private LSENode primeiro;

    public boolean isEmpty() {
        if (this.primeiro == null)
            return true;
        else
            return false;
    }

    public void exibirTodos() {
        LSENode aux;

        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            // loop para pegar o proximo e enquanto for diferente de null (chegar no final)
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void exibirAluno(String matr) {
        Aluno aux = new Aluno(matr);
        LSENode result = this.buscar(aux);

        if (result != null)
            System.out.println("Dados do aluno: " + result.getInfo());
        else
            System.out.println("Aluno não encontrado");
    }

    private LSENode buscar(Aluno aluno) {
        LSENode aux;
        if (this.isEmpty() == true)
            return null;
        else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().compareTo(aluno) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void inserirInicio(Aluno aluno) {
        LSENode novo = new LSENode(aluno);
        LSENode result = this.buscar(aluno);
        // se a lista estiver vazia
        if (result != null) {
            System.out.println("Aluno já cadastrado!");
            if (isEmpty())
                this.primeiro = novo;
            // se não insere
            else {
                novo.setProx(this.primeiro);
                this.primeiro = novo;
            }
            System.out.println("Aluno cadastrado!");
        }
    }

    public void inserirFinal(Aluno aluno) {
        LSENode novo = new LSENode(aluno);
        LSENode aux = this.primeiro;
        LSENode result = this.buscar(aluno);
        if (result != null) {
            System.out.println("Aluno já cadastrado!");
            if (this.isEmpty() == true)
                this.primeiro = novo;
            else {
                // loop para pegar o proximo e enquanto for diferente de null (chegar no final)
                while (aux.getProx() != null) {
                    aux = aux.getProx();
                }
                // insere ultimo
                aux.setProx(novo);
            }
            System.out.println("Aluno cadastrado!");
        }
    }

    public void alteraMedia(String matr) {
        Scanner in = new Scanner(System.in);
        Aluno aux = new Aluno(matr);
        double novaMedia;
        LSENode result = this.buscar(aux);

        if (result == null)
            System.out.println("Aluno não esta cadastrado!");
        else {
            System.out.println("Informe a média do aluno: ");
            novaMedia = in.nextDouble();
            result.getInfo().setMedia(novaMedia);
            System.out.println("Média alterada para :" + novaMedia);
        }
        in.close();
    }

    public void alteraFaltas(String matr) {
        Scanner in = new Scanner(System.in);
        Aluno aux = new Aluno(matr);
        int faltas;
        LSENode result = this.buscar(aux);

        if (result == null)
            System.out.println("Aluno não esta cadastrado!");
        else {
            System.out.println("Informe a quantidade de faltas do aluno:");
            faltas = in.nextInt();
            result.getInfo().setFaltas(faltas);
            System.out.println("Quantidade de faltas alteradas para :" + faltas);
        }
        in.close();
    }

    public void removeFinal() {
        LSENode aux, penultimo = null;
        if (this.isEmpty() == true) // lista vazia
            System.out.println("Lista vazia!");
        else if (this.primeiro.getProx() == null) // lista com apenas um nó
            this.primeiro = null;
        else {
            aux = this.primeiro;
            // loop para pegar o proximo e enquanto for diferente de null (chegar no final)
            while (aux.getProx() != null) {
                penultimo = aux;
                aux = aux.getProx();
            }
            System.out.println("Remoção efetuada!");
            penultimo.setProx(null);
        }
    }

    public void removeUmAluno(String matr) {
        Aluno aux = new Aluno(matr);
        LSENode atual, anterior;
        if (this.isEmpty() == true)
            System.out.println("Lista vazia!");
        else if (this.primeiro.getProx() == null) {
            if (aux.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = null;
                System.out.println("Aluno removido!");
            } else
                System.out.println("Aluno nao encontrado!");
        } else {
            if (aux.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = this.primeiro.getProx();
                System.out.println("Aluno removido!");
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
            else
                anterior.setProx(atual.getProx());
            System.out.println("Aluno removido!");
        }
    }

    public LSEAluno criarCopia() {
        LSENode aux = null;
        LSEAluno copiaLista = new LSEAluno();
        if (this.isEmpty() == true) {
            System.out.println("Lista está vazia!");
            return copiaLista;
        }

        aux = this.primeiro;
        LSENode auxProx = aux;

        do {
            Aluno aluno = aux.getInfo();
            Aluno alunoCopy = null;
            if (aluno != null) {
                alunoCopy = new Aluno(aluno.getMatr());
                alunoCopy.setNome(aluno.getNome());
                alunoCopy.setMedia(aluno.getMedia());
                alunoCopy.setFaltas(aluno.getFaltas());
            }
            LSENode nodeCopy = new LSENode(alunoCopy);
            if (copiaLista.primeiro == null) {
                copiaLista.primeiro = nodeCopy;
                auxProx = copiaLista.primeiro;
            } else {
                auxProx.setProx(nodeCopy);
                auxProx = nodeCopy;
            }
            aux = aux.getProx();
        } while (aux != null);
        return copiaLista;
    }

    public LSEAluno criarUniao(LSEAluno nova) {
        LSEAluno listaUniao = new LSEAluno();
        LSENode aux;
        Aluno original, copia;

        aux = this.primeiro;
        while (aux != null) {
            original = aux.getInfo();
            copia = original.copiarAluno();
            listaUniao.inserirInicio(copia);
            aux = aux.getProx();
        }
        aux = nova.primeiro;
        while (aux != null) {
            original = aux.getInfo();
            copia = original.copiarAluno();
            listaUniao.inserirInicio(copia);
            aux = aux.getProx();
        }
        return listaUniao;

    }
}
