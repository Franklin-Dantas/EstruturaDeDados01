package LivrariaOrdenada;

public class Livro implements Comparable <Livro>{
    private String id;
    private String titulo;
    private String autor;
    private double valor;
    private int estoque;

    public Livro (String id, String titulo, String autor, double valor, int estoque) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.valor = valor;
        this.estoque = estoque;
    }

    public Livro (String id) {
        this.id = id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public void setAutor (String autor) {
        this.autor = autor;
    }

    public void setValor (double valor) {
        this.valor = valor;
    }

    public void setEstoque (int estoque) {
        this.estoque = estoque;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    @Override
    public int compareTo(Livro livro) {
        return this.id.compareTo(livro.id);
    }

    @Override
    public String toString() {
        return this.id + " " + this.titulo + " " + this.autor + " " + this.valor + " " + this.estoque + " ";
    }
    
}
