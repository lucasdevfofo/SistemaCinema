public class Sala {
    private int id;
    private int capacidade;

    public Sala(int id, int capacidade) {
        this.id = id;
        this.capacidade = capacidade;
    }

    public int getId() { return id; }
    public int getCapacidade() { return capacidade; }

    @Override
    public String toString() {
        return "Sala{id=" + id + ", capacidade=" + capacidade + "}";
    }
}
