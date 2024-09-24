package dao;

public class ContratoDAO implements IContratoDAO {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public Contrato buscar(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public boolean excluir(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public boolean atualizar(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }
}
