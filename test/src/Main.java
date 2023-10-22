public class Main {
    public static void main(String[] args){
int x=4;
int y=7;
int z=9;
        z=mystery(y,x,z);
        y=mystery(z,x,y);
        x=mystery(x,z,y);
        System.out.println(x);
    }
public static int mystery(int x,int y,int z){
        x++;
        y--;
        z=x-y;
        return z;
}
}
