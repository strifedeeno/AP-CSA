public class App {
    public static int NUM_LEVELS=4;
    public static void main(String[] args) throws Exception {
       System.out.println("Main");
       bracketQuoteThing();
       for(int i=0;i<NUM_LEVELS;i++){
        System.out.print("\\\\");
        for(int j=2;j<2*NUM_LEVELS;j){}
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
