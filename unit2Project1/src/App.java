public class App {
    public static int NUM_LEVELS=5;
    public static void main(String[] args) throws Exception {
        int lengthOfthing = NUM_LEVELS*2;
        System.out.println(lengthOfthing);
       System.out.println("Main");
       bracketQuoteThing();
       for(int i=NUM_LEVELS;i>0;i--){
        for(int x=lengthOfthing;0<=x-i*2;x-=1){
            System.out.print(" ");
        }
        System.out.print("\\");
        for(int j=0;j<i;j++){
            System.out.print("::");
        }
        System.out.println("/");
       }
       middleThing();
       for(int i=1;i<NUM_LEVELS;i++){
        System.out.print("/");
        for(int j=0;j<i;j++){
            System.out.print("::");
        }
        System.out.println("\\");
       }
       bracketQuoteThing();
    }
    public static void bracketQuoteThing(){
        System.out.print("|");
        for(int quotes= 0; quotes<NUM_LEVELS*2;quotes++){
            System.out.print("\"");
        }
        System.out.print("|");
        System.out.println();
    }
    public static void middleThing(){
        System.out.println("||");
    }
}
