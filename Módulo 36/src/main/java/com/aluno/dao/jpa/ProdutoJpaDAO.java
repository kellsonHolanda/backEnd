package com.aluno.dao.jpa;

import com.aluno.dao.generic.jpa.GenericJpaDB1DAO;
import com.aluno.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
