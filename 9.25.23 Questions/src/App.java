import java.math.BigInteger;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Please make sure that the first number is smaller than the second number.");
        System.out.println(cumsum(1,));
    }
    public static BigInteger cumsum(int a, int b) {
        BigInteger number = BigInteger.valueOf(1);
        for (int i = a; i <= b; i++) {
            number = number.multiply(BigInteger.valueOf(i));
        }
        return number;
    }
    
}
