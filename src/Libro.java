public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private boolean prestado;

    public Libro(String titulo, String autor, int numPaginas, boolean prestado){
        this.titulo = "titulo";
        this.autor = "autor";
        this.numPaginas = -1;
        this.prestado = false;

    }
    public Libro(){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getNumPaginas(){
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }
    public boolean isPrestado(){
        return prestado;
    }
    public void setPrestado(boolean prestado){
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                ", prestado=" + prestado +
                '}';
    }
}
