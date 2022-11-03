package CopiaDaLista;

public class Aluno implements Comparable <Aluno> {
    // cosntrutor e metodos get e set
    private String nome;
    private String matr;
    private double media;
    private int faltas;
    
    public Aluno(String m){
        this.matr = m;
    }

    public Aluno(String nome, String matr) {
        this.nome = nome;
        this.matr = matr;
    }

    public Aluno (String nome, String matr, double media, int faltas) {
        this.nome = nome;
        this.matr = matr;
        this.media = media;
        this.faltas = faltas;
    }

    // metodos get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatr() {
        return matr;
    }
    public void setMatr(String matr) {
        this.matr = matr;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public int getFaltas() {
        return faltas;
    }
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    public String toString() {
        return "Nome do aluno: " + nome + ". \nMatricula: " + matr + ". \nMedia: " + media + ". \nFaltas: " + faltas +".";
    }
    
    // metodo compareTo para comparar matriculas
    @Override
    public int compareTo (Aluno aluno) {
        int result;
        result = this.getMatr().compareTo(aluno.getMatr());
        return result;
    }

    
    public Aluno copiarAluno(){
        Aluno novo = new Aluno(this.matr, this.nome, this.media, this.faltas);
        return novo;
    }

}
