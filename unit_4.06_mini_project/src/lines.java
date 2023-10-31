import java.util.*;
public class lines {
    
    public static void main(String[] args) {
        lines();
    }
    public static ArrayList<String> lines(){
        Scanner scan = new Scanner(System.in);
        boolean thing=true;
        ArrayList<String> liststring=new ArrayList<String>();
        while(thing=true){
            System.out.println("Enter username");
            String hi= scan.nextLine();
            if(hi=="!go"){
                thing=false;
            }
            else{
                liststring.add(hi);
            }
        }
        return liststring;
    }
}
