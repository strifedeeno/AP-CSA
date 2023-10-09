import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int win
        Random rand= new Random();
        int randomNumber= rand.nextInt(3)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your pick (1--rock, 2--paper, 3--scissor, q--exit): ");
        String input = scanner.nextLine();
        System.out.println("Computer picks: "+ randomNumber);
        int numinput=0;
        if(input.equals("q")){
            return;
        }
        else{
            numinput = Integer.valueOf(input);
        }
        if(numinput==3 && randomNumber==2){
            System.out.println("works");
        }
    }
}
