import java.util.*;

// Repositório para CRUD de Filmes - Aplicando GRASP Information Expert
public class FilmeRepository {
    private List<Filme> filmes = new ArrayList<>();

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public List<Filme> listarFilmes() {
        return filmes;
    }

    public void removerFilme(int id) {
        filmes.removeIf(f -> f.getId() == id);
    }
}
