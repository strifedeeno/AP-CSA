public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getFirstFactor(27));
    }
    public static int getFirstFactor(int x)  {
        boolean thing=false;
        while(!thing){
            for(int i =2;i<=x;i++){
                if(x%i==0){
                    thing=true;
                    return i;
                }
            }
        }
        return -2;
}


}
