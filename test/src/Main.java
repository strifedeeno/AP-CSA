import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] ar1 = {"Hello", "World","Bob" };
        System.out.println(vowler(ar1));
    }
    public static int vowler(String[] string1) {
        int count = 0;
        for (int i = 0; i < string1.length; i++){
            for (int j = 0; j<string1[i].length(); j++){
                if(string1[i].charAt(j)=='o'){
                    count++;
                }
            }
        }
        return count;
    }
}
