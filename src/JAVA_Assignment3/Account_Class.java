package JAVA_Assignment3;

import java.io.*;

class Accounts
{
    private String name;
    private int a_c_number;
    private boolean a_c_type;
    private double balance;

    Accounts()
    {
        name = "N/A";
        a_c_number = 0;
        a_c_type = false;
        balance = 0;
    }

    Accounts(String p_name, int p_a_c_number, boolean p_a_c_type, double p_balance)
    {
        name = p_name;
        a_c_number = p_a_c_number;
        a_c_type = p_a_c_type;
        balance = p_balance;
    }

    boolean deposit(int money)
    {
        if(this.balance <= 50)
            return false;
        else
        {
            this.balance = this.balance + money;
            return true;
        }
    }

    void get_name_balance()
    {
        System.out.println("The user name is " + this.name +"\nThe A/C Number is "+ this.a_c_number+ ".\nThe balance is " + this.balance);
    }
}

public class Account_Class {
    public static void main(String args[]) throws IOException
    {
        Accounts first_account = new Accounts();
        first_account.get_name_balance();

        String name;
        int ac_num, balance;
        //boolean ac_type;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name : ");
        name = input.readLine();
        System.out.println("Enter Your Account Number: ");
        ac_num = Integer.parseInt(input.readLine());
        System.out.println("Enter Your Last Balance : ");
        balance = Integer.parseInt(input.readLine());

        Accounts second_account = new Accounts(name, ac_num, true, balance);

        System.out.println("Do you want to deposit money ?\n1. Yes\n2. No");
        int ans = Integer.parseInt(input.readLine());
        if(ans == 1)
        {
            System.out.println("Enter the money you want to deposit :");
            int amount = Integer.parseInt(input.readLine());
            if(second_account.deposit(amount))
            {
                System.out.println("Deposit Successful and details are :");
                second_account.get_name_balance();
            }
            else
            {
                System.out.println("Deposit Unsuccessful because balance is less than 50 and details are :");
                second_account.get_name_balance();
            }
        }
    }
}
