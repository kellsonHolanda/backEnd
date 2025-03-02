package br.com.nome.dao;

import br.com.nome.domain.Produto;

public interface IProdutoDAO {

    public Integer cadastrar(Produto produto) throws Exception;

    public Produto consultar(String codigo) throws Exception;

    public Integer excluir(Produto produtoBD) throws Exception;

    Produto buscarTodos() throws Exception;

    Integer atualizar(Produto produto) throws Exception;

}
