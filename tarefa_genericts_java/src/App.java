import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Honda modelo1 = new Honda();
        modelo1.setMotor(5555);
        
        Fiat modelo2 = new Fiat();
        modelo2.setMotor(77777);

        Ford modelo3 = new Ford();
        modelo3.setMotor(213456);
        
        Scanner scanner = new Scanner(System.in);
        List<Object> list = new ArrayList<>();

        while (list.size() < 3){
            System.out.print("Digite a marca de um Carro ou 'sair' para encerrar: ");
            String entrada = scanner.nextLine().toLowerCase();
            if (entrada.equalsIgnoreCase("sair")) {
                    break;
            } else {
                
            list.add(entrada);
                    

            };
        };
        System.out.println("Escolha uma das opções da lista: ");
        for (int i = 0; i < list.size(); i++) {
            String escolha = (String) list.get(i);
            System.out.println(i + "-" + escolha);
            
        };
        
        System.out.println("Digite o número indicativo: ");
        
        try{
        int i = scanner.nextInt();
        System.out.println("Você escolheu o item: " + list.get(i));
        String escolha = (String) list.get(i);
        if(escolha.equals("honda")){
            System.out.println("Você escolheu um veículo disponível em nosso estoque. Ele tem as seguintes características: " + modelo1.getMarca());
            System.out.println("Marca: " + modelo1.getMarca());
            System.out.println("Modelo: " + modelo1.getModelo());
            System.out.println("Cor: " + modelo1.getCor());
            System.out.println("Potência do Motor: " + modelo1.getMotor());
        } else if( escolha.equals("fiat")){
            System.out.println("Você escolheu um veículo disponível em nosso estoque. Ele tem as seguintes características: " + modelo2.getMarca());
            System.out.println("Marca: " + modelo2.getMarca());
            System.out.println("Modelo: " + modelo2.getModelo());
            System.out.println("Cor: " + modelo2.getCor());
            System.out.println("Potência do Motor: " + modelo2.getMotor());
        } else if (escolha.equals("ford")){
            System.out.println("Você escolheu um veículo disponível em nosso estoque. Ele tem as seguintes características: " + modelo3.getMarca());
            System.out.println("Marca: " + modelo3.getMarca());
            System.out.println("Modelo: " + modelo3.getModelo());
            System.out.println("Cor: " + modelo3.getCor());
            System.out.println("Potência do Motor: " + modelo3.getMotor());

        } else{
            System.out.println("Infelizmente este modelo de veículo não está disponível em nosso estoque.");
        }
        } catch (Exception e){
            System.out.println("Foi digitado um número inexistente. O programa será fechado.");

        }
        
    scanner.close();
    }

    


}



    
    

