import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        magicBox(3);
    }

    public static void magicBox(int size) {
        int[][] array= new int[size*2+1][size*2+1];
        for(int i =0; i < size;i++){
            for(int j = 0;j < size;j++){
              if(j > i){
                array[i][j] = i;
              }
              else {
                array[i][j] = j;
              }
            }
          }
    }
}