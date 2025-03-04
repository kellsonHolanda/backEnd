package com.aluno.dao.jpa;

import com.aluno.dao.generic.jpa.GenericJpaDAO;
import com.aluno.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
