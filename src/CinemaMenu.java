import java.util.Scanner;

public class CinemaMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilmeRepository filmeRepo = new FilmeRepository();
        FilmeService filmeService = new FilmeService(filmeRepo);
        SalaRepository salaRepo = new SalaRepository();
        SalaService salaService = new SalaService(salaRepo);
        IngressoRepository ingressoRepo = new IngressoRepository();
        IngressoService ingressoService = new IngressoService(ingressoRepo);

        while (true) {
            System.out.println("\n=== Menu do Cinema ===");
            System.out.println("1. Cadastrar Filme");
            System.out.println("2. Listar Filmes");
            System.out.println("3. Excluir Filme");
            System.out.println("4. Cadastrar Sala");
            System.out.println("5. Listar Salas");
            System.out.println("6. Excluir Sala");
            System.out.println("7. Cadastrar Ingresso");
            System.out.println("8. Listar Ingressos");
            System.out.println("9. Excluir Ingresso");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do filme: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o gênero do filme: ");
                    String genero = scanner.nextLine();
                    filmeService.cadastrarFilme(titulo, genero);
                    System.out.println("Filme cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("\nLista de Filmes:");
                    filmeService.listarFilmes();
                    break;
                case 3:
                    System.out.print("Digite o ID do filme a excluir: ");
                    int idFilme = scanner.nextInt();
                    filmeService.excluirFilme(idFilme);
                    System.out.println("Filme excluído com sucesso!");
                    break;
                case 4:
                    System.out.print("Digite a capacidade da sala: ");
                    int capacidade = scanner.nextInt();
                    salaService.cadastrarSala(capacidade);
                    System.out.println("Sala cadastrada com sucesso!");
                    break;
                case 5:
                    System.out.println("\nLista de Salas:");
                    salaService.listarSalas();
                    break;
                case 6:
                    System.out.print("Digite o ID da sala a excluir: ");
                    int idSala = scanner.nextInt();
                    salaService.excluirSala(idSala);
                    System.out.println("Sala excluída com sucesso!");
                    break;
                case 7:
                    System.out.print("Digite o preço do ingresso: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Digite o ID da sala: ");
                    int salaId = scanner.nextInt();
                    ingressoService.cadastrarIngresso(preco, salaId);
                    System.out.println("Ingresso cadastrado com sucesso!");
                    break;
                case 8:
                    System.out.println("\nLista de Ingressos:");
                    ingressoService.listarIngressos();
                    break;
                case 9:
                    System.out.print("Digite o ID do ingresso a excluir: ");
                    int idIngresso = scanner.nextInt();
                    ingressoService.excluirIngresso(idIngresso);
                    System.out.println("Ingresso excluído com sucesso!");
                    break;
                case 10:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
