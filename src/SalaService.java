public class SalaService {
    private SalaRepository repository;
    private static int contador = 1;

    public SalaService(SalaRepository repository) {
        this.repository = repository;
    }

    public void cadastrarSala(int capacidade) {
        Sala sala = new Sala(contador++, capacidade);
        repository.adicionarSala(sala);
    }

    public void listarSalas() {
        repository.listarSalas().forEach(System.out::println);
    }

    public void excluirSala(int id) {
        repository.removerSala(id);
    }
}
