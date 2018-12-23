package Java_Assignment2;
import java.io.*;

public class get_day {
    public static void main(String args[])throws IOException{
        int get_day_number;
        System.out.println("Provide the day number (1 - 7)");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        get_day_number = Integer.parseInt(input.readLine());

        if(get_day_number == 1)
            System.out.println("Have A Nice Day !!!");
        else{
            if(get_day_number == 2 || get_day_number == 3 || get_day_number == 4 || get_day_number == 5 || get_day_number == 6)
                System.out.println("Welcome Back To Working Day");
            else
                System.out.println("Have A Nice Weekend Day !!!");
        }
    }
}
