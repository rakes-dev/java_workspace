import java.io.*;

class ThreadEx extends Thread{
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(Thread.currentThread().getId() + " value "+ i );
		}
    try {
      Thread.sleep(100);
    }
    catch(InterruptedException e){
      e.printStackTrace();
    }

	}
	public static void main(String[] args){
		ThreadEx th = new ThreadEx();
		th.start();
    ThreadEx th1 = new ThreadEx();
    th1.start();
	}

}
