package Java_Assignment2;
import java.io.*;
public class largest_smallest_in_array {
    public static void main(String arg[]) throws IOException{

        int[] array = new int[10];
        BufferedReader input_line = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++){
            System.out.println("Provide the integer for index " + i);
            array[i] = Integer.parseInt(input_line.readLine());
        }

        //For maximum and minimum in array
        int max = array[0], min = array[0];

        for (int i = 1; i < 10; i++){
            if(max < array[i])
                max = array[i];

            if(min > array[i])
                min = array[i];
        }
        System.out.println("The maximum is " + max + " and minimum is " + min);
    }
}
