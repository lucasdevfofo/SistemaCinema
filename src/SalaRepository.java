import java.util.*;

public class SalaRepository {
    private List<Sala> salas = new ArrayList<>();

    public void adicionarSala(Sala sala) {
        salas.add(sala);
    }

    public List<Sala> listarSalas() {
        return salas;
    }

    public void removerSala(int id) {
        salas.removeIf(s -> s.getId() == id);
    }
}
