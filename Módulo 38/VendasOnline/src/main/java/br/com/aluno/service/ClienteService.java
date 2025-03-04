/**
 * 
 */
package br.com.aluno.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.aluno.dao.IClienteDAO;
import br.com.aluno.domain.Cliente;
import br.com.aluno.exceptions.DAOException;
import br.com.aluno.exceptions.MaisDeUmRegistroException;
import br.com.aluno.exceptions.TableException;
import br.com.aluno.services.generic.GenericService;

@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	private IClienteDAO clienteDAO;

	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		return clienteDAO.filtrarClientes(query);
	}

}
