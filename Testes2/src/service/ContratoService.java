package service;

import dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;
    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
    	contratoDao.buscar();
        return "Buscando";
    }

    @Override
    public String atualizar() {
    	contratoDao.atualizar();
        return "Atualizando";
    }

    @Override
    public String excluir() {
    	contratoDao.excluir();
        return "Excluindo";
    }
}
