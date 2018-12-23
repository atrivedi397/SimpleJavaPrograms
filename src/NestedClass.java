class Outer{
    void Test(){
        Inner inner = new Inner();
        System.out.println("This is outer class");
        inner.Display();
    }

    class Inner{
        void Display(){
            System.out.println("The Inner Display called form outer ");
        }
    }
}
public class NestedClass {
    public static void main(String args[])
    {
        Outer outer = new Outer();
        outer.Test();
    }
}
