import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int numinput=0;
        int wincount=0;
        boolean thing=true;
        while (thing=true) {
        Random rand= new Random();
        int randomNumber= rand.nextInt(3)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your pick (1--rock, 2--paper, 3--scissor, q--exit): ");
        String input = scanner.nextLine();
        System.out.println("Computer picks: "+ randomNumber);
        
            if(input.equals("q")){
                break;
            }
            else{
                numinput = Integer.valueOf(input);
            }
            if(numinput==3 && randomNumber==2){
                System.out.println("You won.");
                wincount++;
            }
            else if(numinput==3 && randomNumber==1){
                System.out.println("You lost.");
            }
            else if(numinput==3 && randomNumber==3){
                System.out.println("You tied");
            }
            else if(numinput==2 && randomNumber==1){
                System.out.println("You won.");
                wincount++;
            }
            else if(numinput==2 && randomNumber==2){
                System.out.println("You tied");
            }
            else if(numinput==2 && randomNumber==3){
                System.out.println("You lost.");
            }
            else if(numinput==1 && randomNumber==1){
                System.out.println("You tied");
            }
            else if(numinput==1 && randomNumber==2){
                System.out.println("You lose.");
            }
            else if(numinput==1 && randomNumber==3){
                System.out.println("You win.");
                wincount++;
            }
            System.out.println(wincount);
        }
    }
}
