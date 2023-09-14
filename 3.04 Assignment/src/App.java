import java.lang.Math;
public class App {
    public static void roadTrip(Double diameter){
        double area= diameter * Math.PI;
        System.out.println("Roadtrip: "+area);
    }
    public static Double distance(Double x1,Double y1, Double x2, Double y2){
        Double distance = Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
        return distance;
    }
    public static Double totalTrip(Double x1,Double y1, Double x2, Double y2, Double x3, Double y3){
        double distance1= distance(x1,y1,x2,y2);
        double distance2= distance(x2,y2,x3,y3);
        double distance3= distance(x3,y3,x1,y1);
        double totaltrip= distance1 + distance2 + distance3;
        return totaltrip;
    }
    
    public static void main(String[] args) throws Exception {
        roadTrip(5.0);
        double distance1= distance(29.0,16.0,34.0,8.0);
        System.out.println("Distance 2: "+distance1);
        double distance2= distance(6.0,19.0,22.0,7.0);
        System.out.println("Distance 2: "+ distance2);
        double distance3= distance(25.0,24.0,16.0,14.0);
        System.out.println("Distance 3: "+ distance3);
        double totalDistance= totalTrip(29.0,16.0,34.0,8.0,6.0,19.0);
        System.out.println("Total Distance between Baltimare, Manehattan, Los Pegasus: "+ totalDistance);
    }
}
