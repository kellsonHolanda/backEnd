/**
 * 
 */
package br.com.aluno.service;

import java.util.List;

import br.com.aluno.domain.Cliente;
import br.com.aluno.exceptions.DAOException;
import br.com.aluno.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
