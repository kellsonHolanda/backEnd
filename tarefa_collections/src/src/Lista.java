package src;
import java.util.Scanner;

import java.util.Set;
import java.util.TreeSet;

public class Lista {
        public static void main(String[] args){
                
                Scanner scanner = new Scanner(System.in);
                Set<String> liNomes = new TreeSet<String>();
                
                while (true){
                        System.out.print("Digite um nome para iserir em uma relação de nomes ou 'sair' para encerrar: ");
                        String entrada = scanner.nextLine();
                        if (entrada.equalsIgnoreCase("sair")) {
                                break;
                        } else{
                            String nome = entrada;
                                
                                liNomes.add(nome);
                        
                                }

                        }
                        scanner.close();
                        System.out.print("Esta é a lista de nomes, em ordem alfabética: "+ liNomes);
                }
}
