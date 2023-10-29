import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Here is the magic box: ");
        magicBox(3);
        System.out.println("Here is the pyramid: ");
        pyramid(6);
    }

    public static void magicBox(int x) {
        int[][] array = new int[x * 2 + 1][x * 2 + 1];
        for (int num = x; num >= 0; num--) {
            for (int i = array.length - 1; i > 0; i--) {
                for (int j = array.length - 1; j > 0; j--) {
                    if (i == num || j == num || i == array.length - num-1 || j == array.length - num-1) {
                        array[i][j] = num;
                    }
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
     public static void pyramid(int x) {
        int[][] array = new int[x+1][x+1];
        for (int num = x; num >= 0; num--) {
            for (int i = array.length - 1; i > 0; i--) {
                for (int j = array.length - 1; j > 0; j--) {
                    if (i == num || j == num) {
                        array[i][j] = num;
                    }
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
