// Cadastro de Filmes - Aplicando GRASP Controller
public class FilmeService {
    private FilmeRepository repository;

    public FilmeService(FilmeRepository repository) {
        this.repository = repository;
    }

    public void cadastrarFilme(String titulo, String genero) {
        Filme filme = FilmeFactory.criarFilme(titulo, genero);
        repository.adicionarFilme(filme);
    }

    public void listarFilmes() {
        repository.listarFilmes().forEach(System.out::println);
    }

    public void excluirFilme(int id) {
        repository.removerFilme(id);
    }
}
