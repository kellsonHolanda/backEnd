package com.aluno;

import com.aluno.dao.IProdutoDao;
import com.aluno.dao.ProdutoDao;
import com.aluno.domain.Produto;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest(){
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar(){
        Produto prod = new Produto();
        prod.setCodigo("A1");
        prod.setNome("Prod Nome");
        prod.setDescrcao("Prod Desc");
        prod.setValor(100D);
        prod = produtoDao.cadastrar(prod);
        assertNotNull(prod);
        assertNotNull(prod.getId());
    }
}
