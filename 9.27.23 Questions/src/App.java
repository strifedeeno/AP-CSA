public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(ncounter("Banna"));
    }
    public static int ncounter(String word){
        int count =0;
        word=word.toLowerCase();
        for(int i= word.length(); i>0;i--){
            if(word.charAt(i)=='n'){
                count++;
            }
        }
        return count;
    }
}
