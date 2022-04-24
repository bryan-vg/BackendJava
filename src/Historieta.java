
public class Historieta {
    private long id;
    private String titulo;
    private int numPaginas;
    private String editorial;

    public Historieta(long id, String titulo, int numPaginas, String editorial){
        this.id = id;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.editorial = editorial;
    }

    public long getId(){
        return id;
    }

    public boolean setId(long id){
        if(id > 0){
            this.id = id;
            return true;
        }else{
            return false;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean setTitulo(String titulo){
        if(titulo != null && !titulo.isEmpty()){
            this.titulo = titulo;
            return true;
        }else{
            return false;
        }
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public boolean seNumPaginas(int numPaginas){
        if(numPaginas > 0){
            this.numPaginas = numPaginas;
            return true;
        }else{
            return false;
        }
    }

    public String getEditorial() {
        return editorial;
    }

    public boolean setEditorial(String editorial){
        if(editorial != null && !editorial.isEmpty()){
            this.editorial = editorial;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Historieta{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", numPaginas=" + numPaginas +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
