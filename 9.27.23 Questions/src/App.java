imp
public class App {
    public static void main(String[] args) throws Exception {
        mystery(74);
    }
    public static void mystery(int x) {
        int y = 1;
        int z = 0;
        while (2 * y <= x) {
            y = y * 2;
            z++;
        }
        System.out.println(y + " " + z);
    }
}
