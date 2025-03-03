package br.com.nomeAluno.services;

import br.com.nomeAluno.dao.IProdutoDAO;
import br.com.nomeAluno.domain.Produto;
import br.com.nomeAluno.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
