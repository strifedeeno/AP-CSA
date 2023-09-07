public class App {
    public static void main(String[] args) throws Exception {
        for(int x=0;x<=10;x++){
            for(int y=6;y>=0;y--){
                if (x==0 || x == 2 || x==4){
                    for(int z=x;z>0;z--){
                        System.out.print(x);
                    }
                    System.out.println();
                }
                if(x==1||x==3||x==5){
                    for(int z=x;z>0;z--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                
            }
        }
    }
}
