import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] ar1={"a","dog", "a", "howo","a"};
        int thing= counterodd(ar1);
        System.out.println(thing);
    }
    public static int counterodd(String[] thing){
        int count= 0;
        int[] intarrya = new int[thing.length];
        for(int i=0; i<thing.length; i++){
            intarrya[i] = thing[i].length();
            if(intarrya[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }
}
