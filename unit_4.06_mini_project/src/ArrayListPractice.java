import java.util.*;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> thing = new ArrayList<String>();
        thing= createList();
        System.out.println(thing);
        thing= addAdjectives(thing);
        System.out.println(thing);
        thing= updateColor(thing);
        System.out.println(thing);
        thing=removeTheCat(thing);
        System.out.println(thing);
        ToSentence(thing);
        System.out.println(sequence(17,11,273));
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
        thing.add(thing.indexOf("fox"),"quick");
        thing.add(thing.indexOf("fox"),"red");
        thing.add(thing.indexOf("dog"),"lazy");
        return thing;
    }
    public static ArrayList<String> updateColor(ArrayList<String> thing){
        thing.set(thing.indexOf("red"),"brown");
        return thing;
    }
    public static ArrayList<String> removeTheCat(ArrayList<String> thing){
        thing.remove("and");
        thing.remove("cat");
        return thing;
    }
    public static void ToSentence(ArrayList<String> thing){
        for(int i=0;i<thing.size();i++){
            if(i<thing.size()-1){
                System.out.print(thing.get(i)+" ");
            }
            else{
                System.out.println(thing.get(i)+".");
            }
        }
    }
    public static ArrayList<Integer> sequence(int start,int increase,int max){
        ArrayList<Integer> numberthing= new ArrayList<Integer>();
        for(int i=0;i<max;i+=increase){
            numberthing.add(i);
        }
        return numberthing;
    }
    public static ArrayList<Integer> createDivisble(int start,int increase,int max){
        ArrayList<Integer> numberthing= new ArrayList<Integer>();
        for(int i=0;i<max;i+=increase){
            numberthing.add(i);
        }
        return numberthing;
    }
}
