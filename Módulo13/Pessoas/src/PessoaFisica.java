public class PessoaFisica extends Pessoas{
    
    private String sobrenome;
    private Long CPF;
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public Long getCPF() {
        return CPF;
    }
    public void setCPF(Long cPF) {
        CPF = cPF;
    }
    @Override
    public String remuneracao() {
        return "salário";
    }
    

    
    
}
