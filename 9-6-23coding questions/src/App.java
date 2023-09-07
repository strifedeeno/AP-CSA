public class App {
    public static void main(String[] args) throws Exception {
        for(int x=0;x<10;x++){
            int number=x;
            if (x==0 || x == 2 || x==4){
                for(int z=6-x;z>0;z--){
                    System.out.print(6-number);
                }
                System.out.println();    
            }
            if(x==1||x==3||x==5){
                for(int z=6-number;z>0;z--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for(int x = -1;x<8;x++){
            int number = x+1;
            for(int z=number;z<4;z+=2){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
