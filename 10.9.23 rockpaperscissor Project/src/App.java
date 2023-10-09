import java.util.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Random rand= new Random();
        int randomNumber= rand.nextInt(3)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your pick (1--rock, 2--paper, 3--scissor, q--exit): ");
        String input = scanner.nextLine();
        System.out.println("Computer pi");
        
    }
}
