public class App {
  public static void main(String[] args) {
    digits();
    swap();
    timeDisplay();
  }
  public static void digits() {
    int x = 7625;
    String tempstring=Integer.toString(x);
    for (int i = 3; i>0; i--){
      System.out.print(tempstring.charAt(i)+",");  
    }
    System.out.println(tempstring.charAt(0));
  }
  public static void swap() {
    double a = 5.5, b = 7.7;
    // To do: write code to swap the values for the above two variables.
    double c=0;
    double d=0;
    c=a;
    d=b;
    a=d;
    b=c;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
  public static void timeDisplay() {
    int hour = 3, minute=42, second=16;
    // To do: use the above variables to print the following string:
    // Your running time is 3h:42m:16s
    System.out.printf("Your running time is %sh:%sm:%ss",hour,minute,second);
  }      
}
