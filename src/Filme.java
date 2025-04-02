import java.util.*;

// Entidade Filme
public class Filme {
    private int id;
    private String titulo;
    private String genero;

    public Filme(int id, String titulo, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }

    @Override
    public String toString() {
        return "Filme{id=" + id + ", titulo='" + titulo + "', genero='" + genero + "'}";
    }
}
