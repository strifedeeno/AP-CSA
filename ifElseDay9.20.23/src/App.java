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
        System.out.println("exercise 4 - shrink");

        System.out.println(shrink("I hate hot weather."));

        System.out.println(shrink("I want to take a walk."));

        System.out.println(shrink("I love Java."));

        System.out.println();
        System.out.println("exercise 5 - generous");

System.out.println(generous("I like chocolates."));

System.out.println(generous("I really like apple pies."));

System.out.println(generous("I super duper like cookies."));

System.out.println();
System.out.println("exercise 6 - codeMaker");

System.out.println(codeMaker("purple"));

System.out.println(codeMaker("candy"));

System.out.println(codeMaker("random"));

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
                if (spaces == 2) {
                    substringbeginning = i + 1; // add 1 to skip the space
                } else if (spaces == 3) {
                    finalstring = input.substring(substringbeginning, i);
                    return finalstring;
                }
            }
        }
        return ""; // default return statement
    }

    public static String shrink(String input) {
        input = input.toLowerCase();
        if (input.charAt(0) == 'i') {
            String newinput = input.substring(2, input.length()-1);
            String output = "Why do you " + newinput+"?";
            return output;
        } else {
            return "Sentence does start with I";
        }
    }
    public static String generous(String input){
        input=input.toLowerCase();
        int lastnum = input.indexOf("like");
        if(input.charAt(0)=='i'){
            return "Here are some"+ input.substring(lastnum+4);
        }
        return "This is a string";
    }
    public static String codeMaker(String input){
        String newString = input.substring(1, 3) + input.charAt(input.length() - 1) + input.charAt(0) + input.substring(3, input.length() - 1) + "a" + input.charAt(input.length() - 1) + "y";
        return newString;
    }

}