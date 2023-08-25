public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1;i<=5;i++){
            for (int j = 6-i;j>0;--j){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
