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
        for(int i=1;i<7;i+=2){
            for(int k=0;k<(7-i)/2;k++){
                System.out.print(" ");
            }
            for(int x=0;x<i;x++){
                System.out.print("*");
            }
            System.out.println();
            for(int k=0;k<(7-i)/2;k++){
                System.out.print(" ");
            }
            for(int x=7;xi;x++){
                System.out.print("*");
            }
        }
    }
}
