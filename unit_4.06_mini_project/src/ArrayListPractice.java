import java.util.*;
public class ArrayListPractice {
    public static void main(String[] args) {
        System.out.println(createList());

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
    public static ArrayList addAdjectives(ArrayList<String> thing){
        thing.add("hello");
        return thing;
    }
}
