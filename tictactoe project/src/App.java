import java.util.*;
public class App {
    public static int turn =0;
    public static void main(String[] args) throws Exception {
        Scanner scan= new Scanner(System.in);
        System.out.print("Do you want to play 2 player or 1 player? Input 1 or 2: ");
        int playermode =scan.nextInt();
        String[][] board=new String[3][3];
        if(playermode==1){
            while(turn<10){
                
                System.out.print("Please input which row you want to go with: ");
                int movex = scan.nextInt()-1;
                System.out.print("Please input which column you want to go with: ");
                int movey = scan.nextInt()-1;
                if(turn%2==0){
                    String playerpiece="x";
                    board[movey][movex]=playerpiece;
                    printBoard(board);
                    turn++;
                }
                else{
                    String playerpiece ="o";
                    board[movey][movex]=playerpiece;
                    printBoard(board);
                    turn++;
                }
            }
        }
        
        printBoard(board);

    }
    public static void printBoard(String[][] theboard){
        for(int i= 0;i<theboard.length;i++){
            System.out.println(Arrays.toString(theboard[i]));
        }
    }
    public static boolean winconditions(String[][] boardthing){
        boolean wonornot=false;
        if(boardthing[0][0]=="x" && boardthing[0][1]=="x" && boardthing[0][2]=="x"){
            wonornot=true;
        }else if(boardthing[1][0]=="x" && boardthing[1][1]=="x" && boardthing[1][2]=="x"){
            wonornot=true;
        }else if(boardthing[2][0]=="x" && boardthing[2][1]=="x" && boardthing[2][2]=="x"){
            wonornot=true;
        }else if(boardthing[0][0]=="x" && boardthing[1][0]=="x" && boardthing[2][0]=="x"){
            wonornot=true;
        }else if(boardthing[0][1]=="x" && boardthing[1][1]=="x" && boardthing[2][1]=="x"){
            wonornot=true;
        }else if(boardthing[0][2]=="x" && boardthing[1][2]=="x" && boardthing[2][2]=="x"){
            wonornot=true;
        }
return wonornot;
    }
}
