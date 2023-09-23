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
        System.out.println("exercise 3 - thirdWord");
        System.out.println(thirdWord("I don’t like May"));
        System.out.println(thirdWord("123 456 789 0"));
        System.out.println(thirdWord("Aaaaa very short word"));
        System.out.println();
    }

    public static String extraStart(String sentence) {
        String charecter3 = sentence.substring(0, 3);
        return charecter3 + charecter3.toUpperCase() + charecter3.toLowerCase();
    }

    public static String nFromTheMiddle(String input, int number) {
        if (input.length() >= 2 && number >= 0 && number < input.length()) {
            return input.substring(input.length() / 2, input.length() / 2 + number);
        } else {
            return "invalid input";
        }
    }

    public static String thirdWord(String input) {
        int spaces = 0;
        int substringbeginning = 0;
        String finalstring = "String";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spaces++;
                if (spaces == 3) {
                substringbeginning = i;
            } else if (spaces == 4) {
                finalstring = input.substring(substringbeginning, i);
                return finalstring;
            }
            }
            
        }
        return ""; // default return statement
    }

}