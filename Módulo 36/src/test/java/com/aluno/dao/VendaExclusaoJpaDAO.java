package com.aluno.dao;

import com.aluno.dao.generic.jpa.GenericJpaDB1DAO;
import com.aluno.dao.jpa.IVendaJpaDAO;
import com.aluno.domain.jpa.VendaJpa;
import com.aluno.exceptions.DAOException;
import com.aluno.exceptions.TipoChaveNaoEncontradaException;

//Classe utilizada somente no teste para fazer a exclusão das vendas
public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
