import java.util.*;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> thing = new ArrayList<String>();
        thing= createList();
        System.out.println(thing);
        System.out.println(addAdjectives(thing));
    }
    public static ArrayList<String> createList(){
        ArrayList<String> thing=new ArrayList<String>();
        thing.add("The");
        thing.add("fox");
        thing.add("jumped");
        thing.add("over");
        thing.add("the");
        thing.add("cat");
        thing.add("and");
        thing.add("dog");
        return thing;
    }
    public static ArrayList<String> addAdjectives(ArrayList<String> thing){
        thing.add("hello");
        return thing;
    }
}
