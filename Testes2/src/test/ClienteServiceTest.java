package test;

import org.junit.Assert;

import org.junit.Test;

import dao.ClienteDaoMock;
import dao.ClienteDao;
import service.ClienteService;

public class ClienteServiceTest {
    @Test(expected=UnsupportedOperationException.class)
public void erroEmTeste()  {
    	ClienteDao mockDao = new ClienteDao();
		ClienteService service = new ClienteService(mockDao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
    
}

    @Test
    public void salvarTest()  {
    	ClienteDaoMock mockDao = new ClienteDaoMock();
		ClienteService service = new ClienteService(mockDao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
    
}
    
}
