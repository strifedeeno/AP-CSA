import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("exercise 1 - extraStart");
        System.out.println(extraStart("Kathy"));
        System.out.println(extraStart("123"));
        System.out.println(extraStart("GRAPE"));
        System.out.println();
        System.out.println("exercise 2 - nFromTheMiddle");
        System.out.println(nFromTheMiddle("go", 1));
        System.out.println(nFromTheMiddle("I like ice", 4));
        System.out.println(nFromTheMiddle("Phrobots", 3));
        System.out.println();
    }
    public static String extraStart(String sentence){
            String charecter3= sentence.substring(0,3);
            return charecter3+charecter3.toUpperCase()+charecter3.toLowerCase();
    }
    public static String nFromTheMiddle(String input, int number) {
        if (input.length() >= 2 && number >= 0 && number < input.length()) {
            int middleIndex = (input.length() - 1) / 2; // Calculate the middle index
        int startIndex = middleIndex - (number - 1); // Calculate the start index of the substring
        
        if (startIndex < 0 || startIndex + 3 > input.length()) {
            return "invalid input";
        }
        
        String middle = input.substring(startIndex, startIndex + 3);
        return middle;
        } else {
            return "invalid input";
        }
    }
}