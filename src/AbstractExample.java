import java.io.*;
abstract class Dimension {
    abstract double area();
}
class Rectangle extends Dimension{
    private double length, breadth;

    Rectangle(double len, double bdth){
        this.length = len;
        this.breadth = bdth;
    }
    @Override
    double area(){
        return this.length*this.breadth;
    }
}
class Triangle extends Dimension{
    private double base, height;
    Triangle(double bse, double high){
        this.base = bse;
        this.height = high;
    }
    @Override
    double area(){
        return this.height*this.base*0.5;
    }
}
public class AbstractExample{
    public static void main(String args[]){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double base_length, height_breadth;
        do {
            System.out.println("\nWhat do you want to Calculate ?\n1. Area Of Rectangle" +
                                "\n2. Area Of Triangle\n3. Exit");
            int ans;
            try{
                ans = Integer.parseInt(input.readLine());
                if(ans == 1 || ans == 2 || ans == 3){
                    if(ans == 1){
                        System.out.println("Enter the length");
                        base_length = Double.parseDouble(input.readLine());
                        System.out.println("Enter the breadth");
                        height_breadth = Double.parseDouble(input.readLine());
                        Rectangle object = new Rectangle(base_length, height_breadth);
                        System.out.println("The Area is " + object.area() + "sq. units");
                    }
                    if (ans == 2){
                        System.out.println("Enter the base");
                        base_length = Double.parseDouble(input.readLine());
                        System.out.println("Enter the height");
                        height_breadth = Double.parseDouble(input.readLine());
                        Triangle object = new Triangle(base_length, height_breadth);
                        System.out.println("The Area is " + object.area() + "sq. units");
                    }
                    if(ans == 3)
                        System.exit(0);
                }
            }
            catch (Exception e){
                System.out.println("Wrong Input !!! Try Again");
            }
        }while (true);
    }
}