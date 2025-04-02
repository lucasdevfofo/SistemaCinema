public class IngressoService {
    private IngressoRepository repository;
    private static int contador = 1;

    public IngressoService(IngressoRepository repository) {
        this.repository = repository;
    }

    public void cadastrarIngresso(double preco, int salaId) {
        Ingresso ingresso = new Ingresso(contador++, preco, salaId);
        repository.adicionarIngresso(ingresso);
    }

    public void listarIngressos() {
        repository.listarIngressos().forEach(System.out::println);
    }

    public void excluirIngresso(int id) {
        repository.removerIngresso(id);
    }
}
