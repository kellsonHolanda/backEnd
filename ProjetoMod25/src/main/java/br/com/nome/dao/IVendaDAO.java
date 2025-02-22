/**
 * 
 */
package br.com.nome.dao;

import br.com.nome.dao.generic.IGenericDAO;
import br.com.nome.domain.Venda;
import br.com.nome.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
