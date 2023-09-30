public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getFirstFactor(1000));
    }
    public static int getFirstFactor(int x)  {
        boolean thing=false;
        while(thing=false){
            for(int i =2;i<=x;i++){
                if(x%i==0){
                    thing=true;
                    return i;
                }
            }
        }
        return 1;
}


}
