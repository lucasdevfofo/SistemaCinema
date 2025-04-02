import java.util.*;

public class IngressoRepository {
    private List<Ingresso> ingressos = new ArrayList<>();

    public void adicionarIngresso(Ingresso ingresso) {
        ingressos.add(ingresso);
    }

    public List<Ingresso> listarIngressos() {
        return ingressos;
    }

    public void removerIngresso(int id) {
        ingressos.removeIf(i -> i.getId() == id);
    }
}
