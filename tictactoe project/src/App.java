import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan= new Scanner(System.in);
        System.out.println("Do you want to play 2 player or 1 player? Input 1 for in");
        String[][] board=new String[3][3];
        printBoard(board);

    }
    public static void printBoard(String[][] theboard){
        for(int i= 0;i<theboard.length;i++){
            System.out.println(theboard[i].toString());
        }
    }
}
