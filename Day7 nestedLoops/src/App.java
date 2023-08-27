public class App { 
    public static void fancyMethod() {
        int d = 7;
        System.out.println("d is " + d);
    }
    public static void main(String[] args) {
        int c = 10; 
        fancyMethod();
        int b = 100;
        System.out.println("c is " + c);
        anotherFancyMethod();
        System.out.println("b is " + b);
    }
    public static void anotherFancyMethod() {
        //start
        int a = 1;
        for (int i = 0; i < 3; i++) {
            int e = 42;
            System.out.println("e is " + e);
        }
        System.out.println("a is " + a);
     
    }
    //end
    /*Output:
    d is 7
    c is 10
    e is 42
    e is 42
    e is 42
    a is 1
    b is 100
     */


    }