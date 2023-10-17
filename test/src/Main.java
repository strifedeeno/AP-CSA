import java.util.*;
public class Main {
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