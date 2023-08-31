public class App {
    public static int NUM_LEVELS=5;
    public static void main(String[] args) throws Exception {
       System.out.println("Main");
       bracketQuoteThing();
       for(int i=NUM_LEVELS;i>0;i--){
        System.out.print("\\");
        for(int j=0;j<i;j++){
            System.out.print(" : :");
        }
        System.out.println(" /");
       }
       middleThing();
       for(int i=1;i<NUM_LEVELS;i++){
        System.out.print("\\");
        for(int j=0;j<i;j++){
            System.out.print(" : :");
        }
        System.out.println(" /");
       }
       bracketQuoteThing();
    }
    public static void bracketQuoteThing(){
        System.out.println("|\" \" \" \" \" \" \" \" \" \" |");
    }
    public static void middleThing(){
        System.out.println("||");
    }
}
