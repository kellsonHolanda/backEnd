package com.aluno;

import com.aluno.dao.IMarcaDao;
import com.aluno.dao.MarcaDao;
import com.aluno.domain.Marca;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MarcaTest {

    private IMarcaDao marcaDao;

    public MarcaTest() {
        marcaDao = new MarcaDao();
    }

    @Test
    public void cadastrar() {
        Marca marca = new Marca("A1", "Ford");
        marca = marcaDao.cadastrar(marca);
        assertNotNull(marca);
    }
}
