public class App {
    public static void main(String[] args) throws Exception {
        for(int i =1;i<7;i++){
            for(int y=6-i;y>0;y--){
                System.out.print("*");
            }
            for(int j=0; j<i; j++){
                System.out.print(i);
            }
            System.out.println();
            System.out.printf("hello%s", i);
        }
    }
}
