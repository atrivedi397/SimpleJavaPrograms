package Java_Assignment2;
import java.io.*;

public class result_grades {
    public static void main(String args[]) throws IOException{
        int marks;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please provide your marks (0 - 100)");
        marks = Integer.parseInt(input.readLine());

        if(marks < 40)
            System.out.println("Sorry, You are fail !!!");
        else{
            if(marks < 50)
                System.out.println("You are good");
            else{
                if(marks < 75)
                    System.out.println("You are very good");
                else
                    System.out.println("You are excellent");
            }
        }
    }
}
