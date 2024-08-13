public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getAverage(10, 8, 5, 4));
    }

    public static float getAverage(float n1, float n2, float n3, float n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }
}
