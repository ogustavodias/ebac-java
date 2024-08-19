public class PessoaJuridica extends Pessoa {
  private String cnpj;
  private String dataAbertura;

  public PessoaJuridica(String nome, String endereco, String cnpj, String dataAbertura) {
    super(nome, endereco);
    this.cnpj = cnpj;
    this.dataAbertura = dataAbertura;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getDataAbertura() {
    return dataAbertura;
  }

  public void setDataAbertura(String dataAbertura) {
    this.dataAbertura = dataAbertura;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString() + " | CNPJ: " + this.cnpj + " | Abertura: " + this.dataAbertura;
  }
}
