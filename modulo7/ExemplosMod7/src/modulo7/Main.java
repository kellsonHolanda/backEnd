package modulo7;

public class Main {
    public static void main(String[] args) {
		Funcionário colaborador = new Funcionário();
		colaborador.matricula(1212);
		colaborador.nome("Joao");
		colaborador.cadastrarEndereco("Rua 1");
		
		Cliente abc = new Cliente();
		abc.setCodigo(34);
		abc.setNome("Alberto");
		abc.setEndereco("Rua 123, bairro XYZ");
		
		Venda transacao = new Venda();
		transacao.setValor(45);
	    transacao.setMarca("Marca XYZ");
		
	    System.out.println(colaborador.getCodigo());
	    System.out.println(colaborador.getNome());
	    System.out.println(colaborador.getEndereco());
	    
	    System.out.println(abc.getCodigo());
	    System.out.println(abc.getNome());
	    System.out.println(abc.getEndereco());
	    
	    
	    System.out.println(transacao.getMarca());
	    System.out.println(transacao.getValor());
	  

		
		}

}
