public class Pessoa {
  private String nome;
  private String sexo;

  public Pessoa(String nome, String sexo) {
    this.nome = nome;
    this.sexo = sexo;
  }

  public String getNome() {
    return nome;
  }

  public String getSexo() {
    return sexo;
  }

  public static boolean isValidMale(String sexo) {
    return sexo.equalsIgnoreCase("Masculino")
        || sexo.equalsIgnoreCase("M");
  }

  public static boolean isValidFemale(String sexo) {
    return sexo.equalsIgnoreCase("Feminino")
        || sexo.equalsIgnoreCase("F");
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Nome: " + this.nome + " | " + "Sexo: " + this.sexo;
  }
}
