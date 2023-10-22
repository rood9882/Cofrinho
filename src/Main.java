import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);

        boolean sair = false;

        while (!sair) {
            System.out.println("\n===== Menu Inicial =====");
            System.out.println("1. Adicionar Moeda");
            System.out.println("2. Remover Moeda");
            System.out.println("3. Listar todas as moedas");
            System.out.println("4. Total convertido em Real");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Para consumir a quebra de linha deixada pelo nextInt()

            switch (opcao) {
                case 1 -> adicionarMoeda(scanner, cofrinho);
                case 2 -> removerMoeda(scanner, cofrinho);
                case 3 -> cofrinho.listaMoedas();
                case 4 -> cofrinho.totalConvertido();
                case 5 -> sair = true;
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    private static void adicionarMoeda(Scanner scanner, Cofrinho cofrinho) {
        System.out.println("\n===== Adicionar Moeda =====");
        System.out.println("Escolha o tipo de moeda:");
        System.out.println("1. Real");
        System.out.println("2. Dólar");
        System.out.println("3. Euro");

        int opcaoMoeda = scanner.nextInt();
        scanner.nextLine(); // Para consumir a quebra de linha deixada pelo nextInt()

        Moeda moeda;

        switch (opcaoMoeda) {
            case 1 -> moeda = new Real();
            case 2 -> moeda = new Dolar();
            case 3 -> moeda = new Euro();
            default -> {
                System.out.println("Opção inválida! Tente novamente.");
                return;
            }
        }

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Para consumir a quebra de linha deixada pelo nextDouble()

        moeda.setValor(valor);
        cofrinho.adicionarMoeda(moeda);

        System.out.print("Moeda adicionada!");
    }

    private static void removerMoeda(Scanner scanner, Cofrinho cofrinho) {
        System.out.println("\n===== Remover Moeda =====");
        System.out.println("Escolha o tipo de moeda para remover:");
        System.out.println("1. Real");
        System.out.println("2. Dólar");
        System.out.println("3. Euro");

        int opcaoMoeda = scanner.nextInt();
        scanner.nextLine(); // Para consumir a quebra de linha deixada pelo nextInt()

        Moeda moeda;

        switch (opcaoMoeda) {
            case 1 -> moeda = new Real();
            case 2 -> moeda = new Dolar();
            case 3 -> moeda = new Euro();
            default -> {
                System.out.println("Opção inválida! Tente novamente.");
                return;
            }
        }

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Para consumir a quebra de linha deixada pelo nextDouble()

        moeda.setValor(valor);

        cofrinho.removerMoeda(moeda);

        System.out.print("Moeda removida!");
    }
}