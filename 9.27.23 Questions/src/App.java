import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanthing= new Scanner(System.in);
        System.out.println("Please input first number: ");
        int x = scanthing.nextInt();
        System.out.println("Please input second number: ");
        int y = scanthing.nextInt();
        System.out.println(mystery(x,y));
    }
    public static String mystery(int x,int y) {
        if(x>y){
            return "yes";
        }
        else{
            return "no";
        }
        
    }
}
