import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        magicBox(3);
    }

    public static void magicBox(int x) {
        int[][] array = new int[x * 2 + 1][x * 2 + 1];
        for(int num=1; num<=x;num++)
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == 0 || j == 0 || i == array.length - 1 || j == array.length - 1) {
                    array[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}