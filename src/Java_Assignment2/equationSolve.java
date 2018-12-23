package Java_Assignment2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class equationSolve {
    public static void main(String[] args) throws IOException {
        BufferedReader input_Stream = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the coefficient of variable with degree 2");
        int coeff_X2= Integer.parseInt(input_Stream.readLine());

        System.out.println("Enter the coefficient of variable with degree 1");
        int coeff_X1= Integer.parseInt(input_Stream.readLine());

        System.out.println("Enter the constant value");
        int constant= Integer.parseInt(input_Stream.readLine());

        find_quad_roots(coeff_X2, coeff_X1, constant);
    }

    private static void find_quad_roots(int a, int b, int c){
        double roots[] = {0, 0};
        double determinant = (4*a*c);
        if (determinant >= 0) {
            roots[0] = (Math.pow(b, 2) + Math.sqrt(determinant)) / 2 * a;
            roots[1] = (Math.pow(b, 2) + Math.sqrt(determinant)) / 2 * a;
            System.out.println("Roots are: "+ roots[0] + " and " + roots[1]);
        }
        else
            System.out.print("Root are imaginary");
    }
}
