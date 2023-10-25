public class PessoaJuridica extends Pessoas{

    
    private Long CNPJ;
    private String ramoDeAtividade;
    public Long getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(Long cNPJ) {
        CNPJ = cNPJ;
    }
    public String getRamoDeAtividade() {
        return ramoDeAtividade;
    }
    public void setRamoDeAtividade(String ramoDeAtividade) {
        this.ramoDeAtividade = ramoDeAtividade;
    }
    @Override
    public String remuneracao() {
        return "faturamento";
    }
    
    
    

    
    
}
