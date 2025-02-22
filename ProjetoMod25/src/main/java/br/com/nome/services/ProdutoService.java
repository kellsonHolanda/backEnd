/**
 * 
 */
package br.com.nome.services;

import br.com.nome.dao.IProdutoDAO;
import br.com.nome.domain.Produto;
import br.com.nome.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
