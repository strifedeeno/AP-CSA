import java.util.*;
public class Main {
<<<<<<< HEAD
    public static void main(String[] args){
int x=4;
int y=7;
int z=9;
        z=mystery(y,x,z);
        y=mystery(z,x,y);
        x=mystery(x,z,y);
        System.out.println(x);
    }
public static int mystery(int x,int y,int z){
        x++;
        y--;
        z=x-y;
        return z;
}
}
=======
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myarray = new int[499];
        int even=0;
        for(int d=0; d <myarray.length; d++) {
            myarray[d] = even;
            even+=2;
        }
        for(int i = 278; i<=456; i++) {
            System.out.println(myarray[i]);
        }
    }
}
>>>>>>> cb6a69be7fe9b7ddee5d26d7a6fdf1f84f2f36c6
