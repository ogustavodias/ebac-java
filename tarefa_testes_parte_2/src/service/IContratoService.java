package service;

import dao.Contrato;

public interface IContratoService {
    String salvar();

    Contrato buscar(int id);

    boolean excluir(int id);

    boolean atualizar(int id);

}
