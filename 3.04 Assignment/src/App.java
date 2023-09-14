import java.lang.Math;
public class App {
    public static void roadTrip(int diameter){
        double area= diameter * Math.PI;
        System.out.println(area);
    }
    public static Double distance(Double x1,Double y1, Double x2, Double y2){
        Double distance = Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
        return distance;
    }
    
    public static void main(String[] args) throws Exception {
        roadTrip(3);

    }
}
