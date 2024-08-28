import java.util.*;

public class Lista<T extends Carro> implements ListaDAO<T> {

  private List<T> list;

  public Lista() {
    this.list = new ArrayList<T>();
  }

  @Override
  public void printAll() {
    System.out.println(this.toString());
  }

  @Override
  public Boolean register(T obj) {
    list.add(obj);

    return true;
  }

  @Override
  public Boolean remove(T obj) {
    int indexOf = list.indexOf(obj);

    if (indexOf == -1)
      return false;

    list.remove(indexOf);
    return true;
  }

  @Override
  public T search(T obj) {
    int indexOf = list.indexOf(obj);

    if (indexOf == -1)
      return null;

    return list.get(indexOf);
  }

  @Override
  public String toString() {
    String textOf = "";

    for (T t : this.list) {
      textOf += t.toString() + "\n";
    }

    return textOf;
  }

}
