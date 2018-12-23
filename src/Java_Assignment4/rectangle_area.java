package Java_Assignment4;
import java.io.*;
class Rectangle{
    private double length, breadth;
    Rectangle(double l, double b){
        length = l; breadth = b;
    }
    double area(){
        return this.length*this.breadth;
    }
}
public class rectangle_area {
    public static void main(String[] args)throws IOException{
        double l, b;
        System.out.println("Provide the length and breadth of rectangle one by one");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        l = Double.parseDouble(input.readLine());
        b = Double.parseDouble(input.readLine());
        Rectangle rectangle = new Rectangle(l, b);
        System.out.println("The Area is " + rectangle.area());
    }
}