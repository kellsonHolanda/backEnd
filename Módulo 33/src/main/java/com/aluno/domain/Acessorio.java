package com.aluno.domain;

import javax.persistence.*;

@Entity
@Table(name = "TB_ACESSORIO")
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acessorio_seq")
    @SequenceGenerator(name = "acessorio_seq", sequenceName = "sq_acessorio", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;

    @Column(name = "VALOR", nullable = false)
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "id_carro_fk",
            foreignKey = @ForeignKey(name = "fk_carro_acerrosio"),
            referencedColumnName = "id", nullable = false
    )
    private Carro carro;

    public Acessorio(String codigo, String nome, Double valor, Carro carro) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.carro = carro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
