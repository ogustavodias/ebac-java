package service;

import dao.Contrato;
import dao.IContratoDAO;

public class ContratoService implements IContratoService {

    private IContratoDAO contratoDao;

    public ContratoService(IContratoDAO dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public Contrato buscar(int id) {
        return contratoDao.buscar(id);
    }

    @Override
    public boolean excluir(int id) {
        return contratoDao.excluir(id);
    }

    @Override
    public boolean atualizar(int id) {
        return contratoDao.atualizar(id);
    }
}
