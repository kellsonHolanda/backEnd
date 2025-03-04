/**
 * 
 */
package br.com.aluno.service;

import java.util.List;

import br.com.aluno.domain.Produto;
import br.com.aluno.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
