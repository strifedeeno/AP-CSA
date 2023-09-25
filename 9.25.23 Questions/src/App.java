public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Please make sure that the first number is smaller than the second number.");
        System.out.println(cumsum(2,6));
    }
    public static int cumsum(int a, int b){
        int number = 0;
        for(int i=a;i<=b;i++){
            number =a;
            number= number*i;
        }
        return number;
    }
}
