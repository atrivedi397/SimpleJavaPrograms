package MultiThreading;
import java.lang.*;
class MyThread implements Runnable{
    private String name;

    MyThread(String thread_name){
        name = thread_name;
        Thread t = new Thread(this, name);
        System.out.println("New Thread " + t);
        t.start();
    }

    public void run(){
        try{
            for (int i = 25; i > 22; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(name + " Interrupted");
        }

        System.out.println(name + " Exiting");
    }
}


public class MultiThread {
    public static void main(String args[]){
        new MyThread("First_thread");
        new MyThread("Second_thread");
        new MyThread("Third_thread");

        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }

        System.out.println("Main Thread Exiting");
    }
}