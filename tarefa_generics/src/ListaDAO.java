public interface ListaDAO<T> {

  Boolean register(T obj);

  Boolean remove(T obj);

  T search(T obj);

  void printAll();

}
