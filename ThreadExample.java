import java.io.*;

class ThreadExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread has ended");
    }

    public static void main(String[] args) {
        ThreadExample ex = new ThreadExample();
        Thread t1= new Thread(ex);
        t1.start();
        System.out.println("Hi");
    }
}
