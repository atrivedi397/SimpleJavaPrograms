import java.io.*;

public class reversing_number {
    public static void main(String args[]) throws IOException {
        int number;
        System.out.println("Enter the number to be reversed");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(input.readLine());

        System.out.println("The reverse number is " + reverse_num(number));
    }

    private static int reverse_num(int number){
        int reverse  = 0;
        for (int i = number; i > 0; i/=10){
            int remainder = i%10;
            reverse = reverse*10 + remainder;
        }
        return reverse;
    }
}
