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
        System.out.println(box.length);
      for(int j =0; j<box.length-1; i++)
        {
          if(i == 0 || j == 0 || i == x*2|| j == x*2)
          {
            
          }
            
        }
      }
    for(int i = 0; i < box.length-1; i++)
      {
        System.out.println(Arrays.toString(box[i]));
      }
  }
}