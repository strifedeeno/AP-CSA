import java.util.*;
public class lines {
    
    public static void main(String[] args) {
        ArrayList<String> liststring=new ArrayList<String>();
        liststring= getLines();
        averageLineLength(liststring);
    }
    public static ArrayList<String> getLines(){
        Scanner scan = new Scanner(System.in);
        boolean thing=true;
        ArrayList<String> liststring=new ArrayList<String>();
        while(thing=true){
            System.out.println("Enter input: ");
            String hi= scan.nextLine();
            if(hi.equals("!go")==true){
                System.out.println("Stopping");
                break;
            }
            else{
                liststring.add(hi);
            }
        }
        return liststring;
    }
    public static void averageLineLength(ArrayList<String> thing){
        int i =0;
        for (String string : thing) {
            System.out.println(string+" The length is: "+string.length());
            i+=string.length();
        }
        System.out.println("The average length for all inputs is: "+ i/(thing.size()));
    }
    public static void removeDup(ArrayList<String> thing){
        
    }
}
