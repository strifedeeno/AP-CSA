import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        extraStart("hello");
    }
    public static void extraStart(String sentence){
            String charecter3= sentence.substring(0,3);
            System.out.print(charecter3);
            System.out.print(charecter3.toUpperCase());
            System.out.print(charecter3.toLowerCase());
            System.out.println();
        }
}
