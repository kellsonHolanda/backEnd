package src;
import java.util.ArrayList;
import java.util.Scanner;



public class ListaArrayList {
        
                public static void main(String[] args){
                        
                Scanner scanner = new Scanner(System.in);
                ArrayList<String> liHomens = new ArrayList<String>();
                ArrayList<String> liMulheres = new ArrayList<String>();
                ArrayList<String> liNaoRespondeuOuNaoQuisOptar = new ArrayList<String>();
                while (true){
                        System.out.print("Digite um nome, seguido de '-' e a sigla do gênero (Como, por exemplo: Maria-F) ou 'sair' para encerrar: ");
                        String entrada = scanner.nextLine();
                        if (entrada.equalsIgnoreCase("sair")) {
                                break;
                        } else{
                                String[] partes = entrada.split("-");
                        
                                if (partes.length == 2) {
                        
                                String nome = partes[0];
                        
                                String genero = partes[1];
                        
                                        if (genero.equalsIgnoreCase("M")) {                                
                                                liHomens.add(nome);
                                        } else if (genero.equalsIgnoreCase("F")){
                                                liMulheres.add(nome);
                                        } else{
                                                liNaoRespondeuOuNaoQuisOptar.add(nome);
                                        }
                        
                                } else{
                                        String nome = partes[0];
                                        liNaoRespondeuOuNaoQuisOptar.add(nome);
                                }

                        }
                }
                scanner.close();
        System.out.print("Esta é a lista de nomes, conforme separação de grupos de gênero: ");
        System.out.print(liHomens);
        System.out.print(liMulheres);
        System.out.print(liNaoRespondeuOuNaoQuisOptar);

}}