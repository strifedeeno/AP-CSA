import java.util.*;

public class App {
    public static int turn = 0;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you want to play 2 player or 1 player? Input 1 or 2: ");
        int playermode = scan.nextInt();
        String[][] board = new String[3][3];
        printBoard(board);
        if (playermode == 1) {
            while (turn < 10) {
                System.out.print("Please input which row you want to go with: ");
                int movex = scan.nextInt() - 1;
                System.out.print("Please input which column you want to go with: ");
                int movey = scan.nextInt() - 1;
                if (board[movex][movey] == null) {
                    if (turn % 2 == 0) {
                        String playerpiece = "x";
                        board[movex][movey] = playerpiece;
                        printBoard(board);
                        turn++;
                    } else if (turn % 2 != 0) {
                        String playerpiece = "o";
                        board[movex][movey] = playerpiece;
                        printBoard(board);
                        turn++;
                    }
                }
                else{
                    System.out.println("That spot has been taken. Try Again!!");
                }
                if (winconditions(board) == true) {
                    if (turn % 2 == 0) {
                        System.out.println("Good Job. Player x won. Here is the final board: ");
                        printBoard(board);
                    } else {
                        System.out.println("Good Job. Player o won. Here is the final board: ");
                        printBoard(board);
                    }
                    break;
                } else if (winconditions(board) == false && turn == 10) {
                    System.out.println("You tied!! Here is the final board:");
                    printBoard(board);
                }
            }
        }else if(playermode == 2){
            
        }
    }

    public static void printBoard(String[][] theboard) {
        for (int i = 0; i < theboard.length; i++) {
            System.out.println(Arrays.toString(theboard[i]));
        }
    }

    public static boolean winconditions(String[][] boardthing) {
        boolean wonornot = false;
        if (boardthing[0][0] == "x" && boardthing[0][1] == "x" && boardthing[0][2] == "x") {
            wonornot = true;
        } else if (boardthing[1][0] == "x" && boardthing[1][1] == "x" && boardthing[1][2] == "x") {
            wonornot = true;
        } else if (boardthing[2][0] == "x" && boardthing[2][1] == "x" && boardthing[2][2] == "x") {
            wonornot = true;
        } else if (boardthing[0][0] == "x" && boardthing[1][0] == "x" && boardthing[2][0] == "x") {
            wonornot = true;
        } else if (boardthing[0][1] == "x" && boardthing[1][1] == "x" && boardthing[2][1] == "x") {
            wonornot = true;
        } else if (boardthing[0][2] == "x" && boardthing[1][2] == "x" && boardthing[2][2] == "x") {
            wonornot = true;
        } else if (boardthing[0][0] == "x" && boardthing[1][1] == "x" && boardthing[2][2] == "x") {
            wonornot = true;
        } else if (boardthing[0][2] == "x" && boardthing[1][1] == "x" && boardthing[2][0] == "x") {
            wonornot = true;
        }
        if (boardthing[0][0] == "o" && boardthing[0][1] == "o" && boardthing[0][2] == "o") {
            wonornot = true;
        } else if (boardthing[1][0] == "o" && boardthing[1][1] == "o" && boardthing[1][2] == "o") {
            wonornot = true;
        } else if (boardthing[2][0] == "o" && boardthing[2][1] == "o" && boardthing[2][2] == "o") {
            wonornot = true;
        } else if (boardthing[0][0] == "o" && boardthing[1][0] == "o" && boardthing[2][0] == "o") {
            wonornot = true;
        } else if (boardthing[0][1] == "o" && boardthing[1][1] == "o" && boardthing[2][1] == "o") {
            wonornot = true;
        } else if (boardthing[0][2] == "o" && boardthing[1][2] == "o" && boardthing[2][2] == "o") {
            wonornot = true;
        } else if (boardthing[0][0] == "o" && boardthing[1][1] == "o" && boardthing[2][2] == "o") {
            wonornot = true;
        } else if (boardthing[0][2] == "o" && boardthing[1][1] == "o" && boardthing[2][0] == "o") {
            wonornot = true;
        }
        return wonornot;
    }
}
