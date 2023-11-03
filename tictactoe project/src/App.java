import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan= new Scanner(System.in);
        System.out.println("Do you want to play 2 player or 1 player? Input 1 or 2: ");
        int playermode =scan.nextInt();
        String[][] board=new String[3][3];
        if(playermode==1){
            boolean game=true;
            while(game==true){
                System.out.println("Please input which column you want to go with: ");
                int movex = scan.nextInt();
                
                int movey = scan.nextInt();

            }
        }
        
        printBoard(board);

    }
    public static void printBoard(String[][] theboard){
        for(int i= 0;i<theboard.length;i++){
            System.out.println(theboard[i].toString());
        }
    }
}
