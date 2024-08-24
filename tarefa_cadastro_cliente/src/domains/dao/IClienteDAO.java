package domains.dao;

import domains.models.Cliente;

public interface IClienteDAO {

  public boolean adicionar(Cliente cliente);

  public boolean remover(String cpf);

  public Cliente buscar(String cpf);

  public void listar();

  public int tamanho();
}