import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] ar1= {1,-3,-5,9,0,-2};
        System.out.println();
    }
    public static void neg(int[] thing){
        for(int i=0; i<thing.length; i++){
            if(thing[i]<0){
                thing[i]=0;
            }
        };
    }
}
