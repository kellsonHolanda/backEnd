package com.aluno.dao.jpa;

import com.aluno.dao.generic.jpa.GenericJpaDAO;
import com.aluno.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
