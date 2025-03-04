/**
 * 
 */
package br.com.aluno.dao;

import java.util.List;

import br.com.aluno.dao.generic.IGenericDAO;
import br.com.aluno.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
