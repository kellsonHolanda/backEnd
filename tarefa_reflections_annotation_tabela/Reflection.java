
public class Reflection {
    public static void main (String Args[]){
        imprimir();

    }

    private static void imprimir(){
        ClasseComAnotacao prod = new ClasseComAnotacao();
        if (prod.getClass().isAnnotationPresent(Tabela.class)){
            Tabela tab = prod.getClass().getAnnotation(Tabela.class);

            System.out.print("A anotação traz as seguintes informações:" + " " + tab.toString());
        }

        
    }
}
