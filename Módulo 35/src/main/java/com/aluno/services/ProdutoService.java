package com.aluno.services;

import com.aluno.dao.IProdutoDAO;
import com.aluno.domain.Produto;
import com.aluno.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
