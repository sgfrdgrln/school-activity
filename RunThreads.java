
import java.util.*;

public class RunThreads {

    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException{

        String firstThreadName, secondThreadName;

        System.out.print("Enter first thread name: ");
        firstThreadName = input.nextLine();
        do {
        System.out.print("Enter second thread name: ");
        secondThreadName = input.nextLine();

        if(firstThreadName.equals(secondThreadName)) {
            System.out.println("Enter a unique thread name.");
        }
        }while(secondThreadName.equals(firstThreadName));
       
        Thread firstThread = new Thread(new HandleThreads(firstThreadName));
        Thread secondThread = new Thread(new HandleThreads(secondThreadName));

        System.out.println(firstThreadName + " is: "+firstThread.getState());
        System.out.println(secondThreadName + " is: "+secondThread.getState());

        // start your thread.
        System.out.println("Thread is starting...");
        firstThread.start();
        secondThread.start();

        // terminate the thread.
        firstThread.join();
        secondThread.join();
        System.out.println("After sleep...");
        Thread.sleep(2000); // add 2 seconds delay
        System.out.println(firstThreadName + " is: "+firstThread.getState());
        System.out.println(secondThreadName + " is: "+secondThread.getState());
        
    }
    
    
}


class HandleThreads extends Thread {

    private String threadName;

    public HandleThreads(String threadName) {
        this.threadName = threadName;
    }


    public void run() {
        try {
            Thread.sleep(2000); // add 2 seconds delay
            System.out.println(threadName + " is: "+Thread.currentThread().getState());
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
       

    }

}

