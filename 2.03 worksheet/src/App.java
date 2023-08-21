public class App {
    public static void main(String[] args) {
        digits();
        swap();
        timeDisplay();
        }
    public static void digits() {
        int x = 7625;
        tempstring=x.toString();
        for (int i=0;i++;){
            System.out.println(tempstring.charAt(i));
        }
        System.out.println(x);
        // To do: write code to print all digits from right to left, one digit at a line.
        // For example: if x is 7625, your output should be like this:
        // 5, 2, 6, 7
        // Note: your code should work for any integer with 4 digits,
        // for example, x=2388, x=9814.
        }
    public static void swap() {
        double a = 5.5, b = 7.7;
        // To do: write code to swap the values for the above two variables.
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        }
    public static void timeDisplay() {
        int hour = 3, minute=42, second=16;
        // To do: use the above variables to print the following string:
        // Your running time is 3h:42m:16s
        }
        
}
