import java.util.List;
import java.util.ArrayList;

public class ListaPessoas {
  private List<Pessoa> all = new ArrayList<>();
  private List<Pessoa> male = new ArrayList<>();
  private List<Pessoa> female = new ArrayList<>();

  public void addPessoa(Pessoa pessoa) {
    this.all.add(pessoa);

    if (Pessoa.isValidMale(pessoa.getSexo()))
      this.male.add(pessoa);
    else if (Pessoa.isValidFemale(pessoa.getSexo()))
      this.female.add(pessoa);
  }

  public List<Pessoa> getAll() {
    return all;
  }

  public List<Pessoa> getFemale() {
    return female;
  }

  public List<Pessoa> getMale() {
    return male;
  }
}
