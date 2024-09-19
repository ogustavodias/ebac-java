import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestFemale {

  @Test
  public void isArrayFemaleList() {
    ListaPessoas lista = new ListaPessoas();

    Pessoa pessoa1 = new Pessoa("TESTE1", "F");
    Pessoa pessoa2 = new Pessoa("TESTE2", "F");
    Pessoa pessoa3 = new Pessoa("TESTE3", "F");

    lista.addPessoa(pessoa1);
    lista.addPessoa(pessoa2);
    lista.addPessoa(pessoa3);

    Assert.assertTrue("Somente mulheres", isFemaleTest(lista.getAll()));
  }

  public static boolean isFemaleTest(List<Pessoa> lista) {
    return lista.stream().allMatch(p -> Pessoa.isValidFemale(p.getSexo()));
  }

}
