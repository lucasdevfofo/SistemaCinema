public class Ingresso {
    private int id;
    private double preco;
    private int salaId;

    public Ingresso(int id, double preco, int salaId) {
        this.id = id;
        this.preco = preco;
        this.salaId = salaId;
    }

    public int getId() { return id; }
    public double getPreco() { return preco; }
    public int getSalaId() { return salaId; }

    @Override
    public String toString() {
        return "Ingresso{id=" + id + ", preco=" + preco + ", salaId=" + salaId + "}";
    }
}
