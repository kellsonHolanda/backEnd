/**
 * 
 */
package br.com.aluno.dao;

import java.util.List;

import br.com.aluno.dao.generic.IGenericDAO;
import br.com.aluno.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

	List<Cliente> filtrarClientes(String query);

}
