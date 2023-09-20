import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        System.out.print("What grade did you earn : ");
        double grade = console.nextDouble();
        if(grade>=4.0){
            System.out.println("You got a A!");
        }
        else{
            if(grade>=3.0){
                System.out.println("You got a B!");
            }
            else{
                if(grade>=2.0){
                    System.out.println("You got a C!");
                }
                else{
                    System.out.println("You got a D or F!");
                }
            }
        }
    }
}
