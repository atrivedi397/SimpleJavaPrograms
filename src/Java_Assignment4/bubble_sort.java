package Java_Assignment4;
import java.io.*;

public class bubble_sort {
    public static void main(String[] args) throws IOException{
        int pass = 0;
        System.out.println("Input Size");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int Size = Integer.parseInt(input.readLine());
        int[] array = new int[Size];

        for (int i = 0; i < Size; i++){
            System.out.println("Provide value at index " + i);
            array[i] = Integer.parseInt(input.readLine());
        }

        // Bubble Sort
        while(pass < Size){
            for (int i = 0; i < Size-1; i++){
                if(array[i] > array[i+1]){
                 int temp = array[i];
                 array[i] = array[i+1];
                 array[i+1] = temp;
                }
            }
            pass++;
        }
        for (int i = 0; i < Size; i++)
            System.out.print(array[i] + " ");
    }
}
