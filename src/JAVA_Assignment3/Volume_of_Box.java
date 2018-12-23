package JAVA_Assignment3;
class Volume
{
    private
    float height, width, depth;

    // Default Constructor
    Volume() {
        height = 1;
        width = 1;
        depth = 1;
    }

    // Parameterized Constructor
    Volume(float h, float w, float d) {
        height = h;
        width = w;
        depth = d;
    }

    // Function For Volume Calculation
    double volume(){
        return height * width * depth;
    }

    //Function For Area Calculation
    double area(){
        return 2*(height*width + width*depth + height*depth);
    }
}

public class Volume_of_Box
{
    public static void main(String args[])
    {
        Volume box1 = new Volume();
        Volume box2 = new Volume(12, 85.3f, 96);

        System.out.println("The volume of Box 1 " + box1.volume());
        System.out.println("The area of Box 1 " + box1.area());
        System.out.println("The volume of Box 2 " + box2.volume());
        System.out.println("The area of Box 2 " + box2.area());
    }
}
