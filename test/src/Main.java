import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] ar1={1,2,3};
        int[] ar2={3,4,5};

        int[] thing= oddmerger(ar1, ar2);
    }
    public static int[] oddmerger(int[] thing, int[] thing2) {
        int[] result= new int[thing.length+thing2.length];
        for (int i=0; i<thing.length; i++){
            result[i] = thing[i];
        }
        for (int i=thing.length; i<result.length; i++){
            result[i] = thing2[i];
        }
        return result;
    }
}
