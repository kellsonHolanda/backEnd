package br.com.nomeAluno.dao;

import br.com.nomeAluno.dao.generic.IGenericDAO;
import br.com.nomeAluno.domain.Produto;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

    Class<Produto> getTipoClasse();

    void atualiarDados(Produto entity, Produto entityCadastrado);

    String getQueryInsercao();

    void setParametrosQueryInsercao(PreparedStatement stmInsert, Produto entity) throws SQLException;

    String getQueryExclusao();

    void setParametrosQueryExclusao(PreparedStatement stmExclusao, String valor) throws SQLException;

    String getQueryAtualizacao();

    void setParametrosQueryAtualizacao(PreparedStatement stmUpdate, Produto entity) throws SQLException;

    void setParametrosQuerySelect(PreparedStatement stmExclusao, String valor) throws SQLException;
}
