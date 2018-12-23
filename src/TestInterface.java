interface Shape{
    double pi = 3.14f;
    double volume(double a , double b );
}

class Sphere implements Shape{
    @Override
    public double volume(double a, double b){
        return pi*a*a*a*(4.0/3.0);
    }
}

class cone implements  Shape{
    @Override
    public double volume(double a, double b){
        return (1.0/3.0)*pi*a*a*b;
    }
}

public class TestInterface {
    public static void main(String args[]){
        Shape s1;
        s1 = new Sphere();
        System.out.println("Volume of Sphere is " + s1.volume(45, 25));
        s1 = new cone();
        System.out.println("Volume of Cone is " + s1.volume(45, 25));
    }
}
