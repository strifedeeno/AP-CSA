public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Please make sure that the first number is smaller than the second number.");
        cumsum(2,5);
    }
    public static int cumsum(int a, int b){
        int number = 0;
        for(int i=1;i<=b;i++){
            a*=i;
            number=a;
        }
    return number;
    }
}