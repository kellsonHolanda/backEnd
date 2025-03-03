package com.aluno;

import com.aluno.dao.CursoDao;
import com.aluno.dao.ICursoDao;
import com.aluno.domain.Curso;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CursoTest {

    private ICursoDao cursoDao;

    public CursoTest(){
        cursoDao = new CursoDao();
    }

    @Test
    public void cadastrar(){
        Curso curso = new Curso();
        curso.setCodigo("A1");
        curso.setDescricao("Curso Teste");
        curso.setNome("Curso Teste");
        curso = cursoDao.cadastrar(curso);
        assertNotNull(curso);
        assertNotNull(curso.getId());
    }
}
