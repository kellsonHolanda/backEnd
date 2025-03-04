package com.aluno.dao.jpa;

import com.aluno.dao.generic.jpa.IGenericJapDAO;
import com.aluno.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
