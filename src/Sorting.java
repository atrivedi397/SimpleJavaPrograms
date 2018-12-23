import java.io.*;
public class Sorting {
    public static void main(String args[]) throws IOException{
        int Size;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Provide the size: ");
        Size = Integer.parseInt(input.readLine());
        int[] array = new int[Size];
        for (int i = 0; i < Size; i++)
            array[i] = Integer.parseInt(input.readLine());

        ///Sorting

        for (int i = 1; i < Size; i++) {
            int key = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }

        ///Print Sorted Sequence
        for (int i = 0; i < Size; i++)
            System.out.println(array[i]);
    }
}
