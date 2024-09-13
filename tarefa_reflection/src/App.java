public class App {
    public static void main(String[] args) throws Exception {
        Class<Table> table = Table.class;

        if (table.isAnnotationPresent(ITable.class)) {
            ITable annotation = table.getAnnotation(ITable.class);
            System.out.println(annotation.value());
        } else {
            System.out.println("Anotação não encontrada");
        }
    }
}
