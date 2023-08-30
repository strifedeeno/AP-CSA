public class App {
    public static int NUM_LEVELS=4;
    public static void main(String[] args) throws Exception {
       System.out.println("Main");
       bracketQuoteThing();
       for(int i=2;i<4*NUM_LEVELS;i++){
        System.out.println();
       }
       middleThing();
       bracketQuoteThing();
    }
    public static void bracketQuoteThing(){
        System.out.println(" |\" \" \" \" \" \" \" \" \" \" |");
    }
    public static void middleThing(){
        System.out.println("||");
    }
}
