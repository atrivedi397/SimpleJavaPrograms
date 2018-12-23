package Java_Assignment2;
import java.io.*;

public class sum_of_odds {
    public static void main(String args[]) throws IOException{
        int beg, last;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Provide the starting number");
        beg = Integer.parseInt(input.readLine());

        System.out.println("Provide the last number");
        last = Integer.parseInt(input.readLine());

        System.out.println("Sum of odds between given range is " + odd_sum(beg, last));
    }

    private static int odd_sum(int start, int end){
        int sum = 0;

        if(start%2 == 0)
            start = start+1;

        if(end%2 == 0)
            end = end-1;
        for (int i = start; i <= end; i+=2)
            sum = sum + i;

        return sum;
    }
}
