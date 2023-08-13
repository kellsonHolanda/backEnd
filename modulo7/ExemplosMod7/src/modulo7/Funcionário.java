package modulo7;

public class Funcionário {
	
	private int codigo;
	
	private String nome;
	
	private String endereco;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}
	

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void matricula(int codigo) {
		setCodigo(codigo);
	}
	public void nome (String nome) {
		setNome(nome);
	}

	public void cadastrarEndereco(String endereco) {
		setEndereco(endereco);
	}

}
