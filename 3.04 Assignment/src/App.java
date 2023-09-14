import java.lang.Math;
public class App {
    public static void roadTrip(Long diameter){
        double area= diameter * Math.PI;
        System.out.println(area);
    }
    public static void distance(Double x1,Double y1, Double x2, Double y2){
        Double distance = Math.sqrt((Math.pow(x2-x1, 2)));
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
