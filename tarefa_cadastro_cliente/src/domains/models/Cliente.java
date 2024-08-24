package domains.models;

public class Cliente {

  private String cpf;
  private String nome;
  private String telefone;
  private String endereco;

  public Cliente(String cpf) {
    this.cpf = cpf;
  }

  public Cliente(String cpf, String nome) {
    this.cpf = cpf;
    this.nome = nome;
  }

  public Cliente(String cpf, String nome, String telefone) {
    this.cpf = cpf;
    this.nome = nome;
    this.telefone = telefone;
  }

  public Cliente(String cpf, String nome, String telefone, String endereco) {
    this.cpf = cpf;
    this.nome = nome;
    this.telefone = telefone;
    this.endereco = endereco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Cliente other = (Cliente) obj;
    if (cpf == null) {
      if (other.cpf != null)
        return false;
    } else if (!cpf.equals(other.cpf))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Nome: " + this.nome + " | CPF: " + this.cpf;
  }

}