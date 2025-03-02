package br.com.nome.dao.generic.jdbc.dao;

import br.com.nome.domain.Produto;

import java.util.List;

public interface IProdutoDAO {

    Integer cadastrar(Produto produto) throws Exception;

    Integer atualizar(Produto produto) throws Exception;

    Produto buscar(String codigo) throws Exception;

    Integer excluir(Produto produto) throws Exception;

    List<Produto> buscarTodos() throws Exception;

    Long getId();

    long getCodigo();

    long getNome();
}
