import java.util.*;
public class ArrayListPractice {
    public static void main(String[] args) {
        createList();
    }
    public static void createList(){
        ArrayList<String> thing=new ArrayList<String>();
        thing.add("The");
        thing.add("fox");
        thing.add("jumped");
        thing.add("over");
        thing.add("the");
        thing.add("cat");
        thing.add("and");
        thing.add("dog");
        System.out.println(thing);
    }
}
