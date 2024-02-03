public class ControleDeFluxo {
    public static void main(String[] args) throws Exception {
        int nota1 = 10;
		int nota2 = 9;
		double nota3 = 7.8;
		int nota4 = 6;
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
        if (media>=7){
            System.out.println("O aluno está Aprovado");
        }
        else if (media>=5) {
            System.out.println("O aluno está de Recuperação");
        }
        else{
            System.out.println("O aluno está Reprovado");
        }
		
    }

    
}
