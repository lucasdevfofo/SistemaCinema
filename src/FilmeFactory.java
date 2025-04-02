// Padrão GoF Factory para criar filmes
public class FilmeFactory {
    private static int contador = 1;

    public static Filme criarFilme(String titulo, String genero) {
        return new Filme(contador++, titulo, genero);
    }
}
