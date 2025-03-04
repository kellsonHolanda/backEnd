package com.aluno.dao.jpa;

import com.aluno.dao.generic.jpa.GenericJpaDB2DAO;
import com.aluno.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
