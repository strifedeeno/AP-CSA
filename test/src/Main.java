import java.util.*;
class Main {
    public static void main(String[] args) {
        magicBox(3);
    }

    public static void magicBox(int x)
    {
        int[][] box = new int[x*2+1][x*2+1];
        for(int i = 0; i < box.length-1; i++)
            {
            for(int j =0; j<box.length-1; j++) // fixed the loop increment
                {
                    if(i == 0 || j == 0 || i == x*2|| j == x*2)
                    {
                        box[i][j] = 1;
                    }
                        
                }
            }
        for(int i = 0; i < box.length-1; i++)
            {
                System.out.println(Arrays.toString(box[i]));
            }
    }
}