import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] ar1= {"dog", "a", "howo"};
        lengther(ar1);
        System.out.println(Arrays.toString(ar1));
    }
    public static int[] lengther(String[] thing){
        int[] intarrya = new int[thing.length];
        for(int i=0; i<thing.length; i++){
            intarrya[i] = thing[i].length();
        }
        return intarrya;
    }
}
