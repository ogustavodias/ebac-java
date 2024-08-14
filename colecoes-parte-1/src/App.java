import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> unorderedList = new ArrayList<>();
        unorderedList.add("Gustavo");
        unorderedList.add("Antonio");
        unorderedList.add("Bianca");
        var orderedList = orderByName(unorderedList);
        System.out.println("Lista não ordenada: " + unorderedList + "\n" + "Lista ordenada: " + orderedList);
    }

    public static List<String> orderByName(List<String> list) {
        List<String> newList = new ArrayList<>();
        newList.addAll(list);
        Collections.sort(newList);
        return newList;
    }
}
