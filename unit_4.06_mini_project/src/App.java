import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        magicBox(3);
    }
    public static void magicBox(int x){
        int[][] array= new int[x*2+1][x*2+1];
        for(int i =0; i<array.length;i++){
            for(int j = 0;i<array[i].length-1;i++){
                if(i==0||j==0||i==array.length-1||i==array[i].length-1){
                    array[i][j] = 2;
                }
            }
        }
        for(int i =0;i<array.length;i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
