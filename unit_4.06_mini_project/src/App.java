import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        magicBox(3);
    }
    public static void magicBox(int x){
        int[][] array= new int[x*2+1][x*2+1];
        for(int i =0; i<array.length;i++){
            
        }
        for(int i =0;i<array.length;i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
