package com.aluno.dao.jpa;

import com.aluno.dao.generic.jpa.GenericJpaDB1DAO;
import com.aluno.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
