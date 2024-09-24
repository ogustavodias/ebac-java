package dao.mocks;

import dao.Contrato;
import dao.IContratoDAO;

public class ContratoDaoMock implements IContratoDAO {

    @Override
    public void salvar() {

    }

    @Override
    public Contrato buscar(int id) {
        return new Contrato(0, "Teste");
    }

    @Override
    public boolean excluir(int id) {
        return true;
    }

    @Override
    public boolean atualizar(int id) {
        return true;
    }
}
