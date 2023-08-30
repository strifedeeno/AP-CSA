public class App {
    public static int NUM_LEVELS=4;
    public static void main(String[] args) throws Exception {
        for(int x =1;x<6;x++){
            for(int a =1;a<x+1;a++){
                System.out.print("=");
            }
            for(int b = 9; b>x;b-=3){
                System.out.print("+");
            }
            for(int c=2;c<x+2;c++){
                System.out.print("&"+"&");
            }
            System.out.println();
            
        }
    }
}
