package dao;

public interface IContratoDAO {
    void salvar();

    Contrato buscar(int id);

    boolean excluir(int id);

    boolean atualizar(int id);
}
