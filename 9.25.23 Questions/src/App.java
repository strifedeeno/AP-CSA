public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Please make sure that the first number is smaller than the second number.");
        System.out.println(cumsum(2,31));
    }
    public static int cumsum(int a, int b){
        int number =1;
        for(int i=a;i<=b;i++){
            number= number*i;
        }
        return number;
    }
}
