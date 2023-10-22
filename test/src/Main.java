import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] ar1={"dog", "a", "howo"};
        voweler(ar1);
    }
    public static int voweler(String[] thing){
        int count = 0;
        for(int i = 0; i <thing.length; i++){
            for(int j = 0; j < thing[i].length(); j++){
                if (thing[i].charAt(j) == 'o'){
                    count++;
                }
            }
            
        }
        return count;
    }
}
