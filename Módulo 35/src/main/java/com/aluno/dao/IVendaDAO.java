package com.aluno.dao;

import com.aluno.dao.generic.IGenericDAO;
import com.aluno.domain.Venda;
import com.aluno.exceptions.DAOException;
import com.aluno.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
