public class App {
    public static void main(String[] args) throws Exception {
        allDigits(1000);
    }
    public static void allDigits(int x)  {
        while(x>0){
            System.out.println(x%10);
            x=x/10;
        }
   	}

}
