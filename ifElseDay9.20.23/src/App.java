import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("exercise 1 - extraStart");
        System.out.println(extraStart("Kathy"));
        System.out.println(extraStart("123"));
        System.out.println(extraStart("GRAPE"));
        System.out.println();
    }
    public static String extraStart(String sentence){
            String charecter3= sentence.substring(0,3);
            return charecter3+charecter3.toUpperCase()+charecter3.toLowerCase();
    }
    
}
