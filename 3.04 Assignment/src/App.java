import java.lang.Math;
public class App {
    public static void roadTrip(Double diameter){
        double area= diameter * Math.PI;
        System.out.println(area);
    }
    public static Double distance(Double x1,Double y1, Double x2, Double y2){
        Double distance = Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
        return distance;
    }
    
    public static void main(String[] args) throws Exception {
        roadTrip(3.0);
        double distance= distance(29.0,16.0,34.0,8.0);
        System.out.println(distance);
    }
}
