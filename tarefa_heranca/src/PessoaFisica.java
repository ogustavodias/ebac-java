public class PessoaFisica extends Pessoa {
  private String cpf;
  private String dataNascimento;

  public PessoaFisica(String nome, String endereco, String cpf, String dataNascimento) {
    super(nome, endereco);
    this.cpf = cpf;
    this.dataNascimento = dataNascimento;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString() + " | CPF: " + this.cpf + " | Nascimento: " + this.dataNascimento;
  }

}
