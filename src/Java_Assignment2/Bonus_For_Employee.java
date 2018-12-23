package Java_Assignment2;

import java.io.*;

public class Bonus_For_Employee {
    public static void main (String args[]) throws IOException{
        double basic_salary; int emp_code;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please provide your employee code :");
        emp_code = Integer.parseInt(input.readLine());

        System.out.println("Please provide your basic salary :");
        basic_salary = Double.parseDouble(input.readLine());

        if(emp_code == 100)
            System.out.println("Your Salary increment is 5 % and salary will be " + calc_salary(basic_salary,0.05));

        else{
            if (emp_code == 200)
                System.out.println("Your Salary increment is 10 % and salary will be " + calc_salary(basic_salary,0.1));

            else{
                if (emp_code == 300)
                    System.out.println("Your Salary increment is 20 % and salary will be " + calc_salary(basic_salary,0.2));

                else
                    System.out.println("Your Salary increment is 25 % and salary will be " + calc_salary(basic_salary,0.25));
            }
        }
    }
    private static double calc_salary(double salary, double increment){
        return salary+(salary*increment);
    }
}
