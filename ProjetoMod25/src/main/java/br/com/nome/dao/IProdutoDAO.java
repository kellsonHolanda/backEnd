/**
 * 
 */
package br.com.nome.dao;

import br.com.nome.dao.generic.IGenericDAO;
import br.com.nome.domain.Produto;


public interface IProdutoDAO extends IGenericDAO<Produto, String>{

    Class<Produto> getTipoClasse();

    void atualizarDados(Produto entity, Produto entityCadastrado);
}
