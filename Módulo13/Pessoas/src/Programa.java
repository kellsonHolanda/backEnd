public class Programa {
    public static void main(String[] args) throws Exception {

        PessoaFisica pF = new PessoaFisica();
        pF.setCPF((long) 99999999999999.999999999);
        pF.setNome("Andre");
        pF.setSobrenome("da Silva");
        imprimir(pF);

        PessoaJuridica pJ = new PessoaJuridica();
        pJ.setCNPJ((long) 99999999999999.999999999);
        pJ.setNome("Massas e Recheios LTDA");
        pJ.setRamoDeAtividade("Alimentação");
        
        imprimir(pJ);
        
    }
    public static void imprimir (Pessoas pessoas){
        if (pessoas instanceof PessoaJuridica){
            PessoaJuridica comerc = (PessoaJuridica) pessoas;
            System.out.println("O(a) " + pessoas.getNome()+ " é " + pessoas.getClass().getName() + " e atua no ramo de " + comerc.getRamoDeAtividade() + ".");
            System.out.println("Sua atividade é remunerada por meio do " + pessoas.remuneracao() + ".");
        } else{
            System.out.println( pessoas.getNome()+ " é " + pessoas.getClass().getName() + " e tem a atividade remunerada por meio do " + pessoas.remuneracao()+ ".");

        }
        
        
    }
    

    
}
