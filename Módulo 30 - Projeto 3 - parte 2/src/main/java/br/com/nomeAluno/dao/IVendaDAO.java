package br.com.nomeAluno.dao;

import br.com.nomeAluno.dao.generic.IGenericDAO;
import br.com.nomeAluno.domain.Venda;
import br.com.nomeAluno.exceptions.DAOException;
import br.com.nomeAluno.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    <SQLException> void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
