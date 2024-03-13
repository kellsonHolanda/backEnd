import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<>();

        while (true) {
            System.out.print("Digite um nome, seguido de ',' e a sigla do gênero (Como, por exemplo: Maria,F) ou 'sair' para encerrar: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            } else {
                String[] partes = entrada.split(",\\s*");

                if (partes.length == 2) {
                    String nome = partes[0];
                    String genero = partes[1];

                    lista.add(new Pessoa(nome, genero));
                }
            }
        }
        scanner.close();

        List<String> filtro = lista.stream()
                .filter(e -> e.getGenero().equalsIgnoreCase("F"))
                .map(Pessoa::getNome)
                .collect(Collectors.toList());

        System.out.println("Nomes de pessoas que se autodeclararam como do gênero feminino: " + filtro);
    }
}