import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        magicBox(3);
    }

    public static void magicBox(int x) {
        int[][] array = new int[x * 2 + 1][x * 2 + 1];
        int num=x+1;
        for (int i = array.length; i >0; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == num-1 || j == num-1 || i == array.length - num || j == array.length - num) {
                    array[i][j] = num;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
