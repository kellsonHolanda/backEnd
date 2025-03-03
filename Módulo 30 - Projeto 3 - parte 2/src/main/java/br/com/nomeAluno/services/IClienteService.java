package br.com.nomeAluno.services;

import br.com.nomeAluno.domain.Cliente;
import br.com.nomeAluno.exceptions.DAOException;
import br.com.nomeAluno.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
