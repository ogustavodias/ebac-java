package domains.dao;

import domains.models.Cliente;
import java.util.*;

public class ClienteMapDAO implements IClienteDAO {
  private Map<String, Cliente> lista;

  public ClienteMapDAO() {
    this.lista = new HashMap<>();
  }

  @Override
  public boolean adicionar(Cliente cliente) {
    Boolean alreadyIn = this.lista.containsKey(cliente.getCpf());
    if (alreadyIn)
      return false;

    this.lista.put(cliente.getCpf(), cliente);
    return true;
  }

  @Override
  public boolean remover(String cpf) {
    Cliente clientToRemove = this.lista.get(cpf);

    if (clientToRemove == null)
      return false;

    this.lista.remove(clientToRemove.getCpf());
    return true;
  }

  @Override
  public Cliente buscar(String cpf) {
    Cliente clientToSearch = this.lista.get(cpf);

    if (clientToSearch == null)
      return null;

    return clientToSearch;
  }

  @Override
  public void listar() {
    for (Cliente cliente : this.lista.values()) {
      System.out.println(cliente);
    }
  }

  @Override
  public int tamanho() {
    return this.lista.size();
  }

  @Override
  public String toString() {
    String textToShow = "";

    for (Cliente cliente : this.lista.values()) {
      textToShow += cliente + "\n";
    }

    return textToShow;
  }

}