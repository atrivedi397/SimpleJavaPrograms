package Java_Assignment2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class pattern {
    public static void main(String[] args) throws IOException {
        BufferedReader input_Stream = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the pattern size (in no. of lines)");
        int lines= Integer.parseInt(input_Stream.readLine());

        make_pattern(lines);
    }

    private static void make_pattern(int upto_lines){
        for(int i=1; i<=upto_lines; i++) {
            int j=upto_lines-i;
            print_sequence1(i);
            print_blanks(j);
            print_sequence2(i);
            System.out.print("\n");
        }
    }

    private static void print_sequence1(int upto_number){
        for(int i=1; i<=upto_number; i++) {
            System.out.print(i +" ");
        }
    }
    private static void print_blanks(int upto_spaces){
        for(int i=0; i<upto_spaces; i++) {
            System.out.print("  ");
        }
    }

    private static void print_sequence2(int upto_number){
        int j=upto_number;
        for(int i=0; i<upto_number; i++) {
            System.out.print(j +" ");
        }
    }
}
