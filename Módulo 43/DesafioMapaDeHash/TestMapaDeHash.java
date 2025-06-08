import java.util.Scanner;

public class TestMapaDeHash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MapaDeHash mapa = new MapaDeHash();
        while (true) {
            System.out.println("Digite 1 para inserir, 2 para deletar, 3 para obter, 4 para limpar, 0 para sair:");
            int op = scanner.nextInt();
            if (op == 0)
                break;
            if (op == 1) {
                System.out.print("Digite a chave: ");
                int key = scanner.nextInt();
                System.out.print("Digite o valor: ");
                int value = scanner.nextInt();
                mapa.put(key, value);
                System.out.println("Par inserido.");
            } else if (op == 2) {
                System.out.print("Digite a chave para deletar: ");
                int key = scanner.nextInt();
                Integer deleted = mapa.delete(key);
                if (deleted != null)
                    System.out.println("Valor removido: " + deleted);
                else
                    System.out.println("Chave não encontrada ou topo inválido.");
            } else if (op == 3) {
                System.out.print("Digite a chave para obter o valor: ");
                int key = scanner.nextInt();
                Integer value = mapa.get(key);
                if (value != null)
                    System.out.println("Valor obtido: " + value);
                else
                    System.out.println("Chave não encontrada.");
            } else if (op == 4) {
                mapa.clear();
                System.out.println("Mapa limpo.");
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}