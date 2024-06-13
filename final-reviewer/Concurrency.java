import java.util.*;
 
// the property of executing multiple threads and processes simultaneously is referred as concurrency.

// context switch is the process of storing a thread's current state and later restoring the state of thread

// main thread - a special thread that is created by the Java VM to run your application.

public class Concurrency
{
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	String firstThreadName, secondThreadName;
    
    System.out.print("Enter first thread name: ");
    firstThreadName = scanner.nextLine();
    System.out.print("Enter second thread name: ");
    secondThreadName = scanner.nextLine();
	
	
	Threader t1 = new Threader();
	Threader t2 = new Threader();
    
    // a thread priority is a numeric value associated with a thread.
    // SETTING PRIORITY IS 1 - 10 ONLY
    // MAX_PRIORITY IS 10
    // MIN_PRIORITY IS 1
    // NORM_PRIORITY IS 5
    
    t1.setPriority(Threader.MAX_PRIORITY); // setPriority() - sets a thread's priority, getPriority() - obtains thread's priority

	t1.setName(firstThreadName); // setName() - sets a thread name, getName() - obtains a thread name
	t2.setName(secondThreadName); // setName() - sets a thread name, getName() - obtains a thread name
	System.out.println();
	System.out.println(firstThreadName + " is: "+t1.getState());
	System.out.println(secondThreadName + " is: "+t2.getState());
    System.out.println("Starting the threads...");
	t1.start(); // start() - starts a thread by calling its run method
	t2.start(); // start() - starts a thread by calling its run method
    System.out.println(t1.isAlive()); // isAlive() determines if the thread is still running (returns true or false)
    System.out.println(t2.isAlive()); // isAlive() determines if the thread is still running (returns true or false)
    
	try {
	    t1.join(); // join() - waits for a thread to terminate
	    t2.join(); // join() - waits for a thread to terminate
	    System.out.println("After sleep...");
	    Thread.sleep(1000); // sleep() - suspends a thread for a period of time
	    System.out.println(firstThreadName + " is: "+t1.getState());
	    System.out.println(secondThreadName + " is: "+t2.getState());
	}
	catch(InterruptedException e) {
	    e.printStackTrace();
	}
	}
}

// a thread is the smallest unit of execution that can be scheduled by the operating system.

// a process is a group of associated threads executed in the same shared environment.

// single-threaded process - contains exactly one thread
 
// multithreaded process - supports more than one thread

// in a shared environment, threads in the same process share the same memory space and communicate
// directly with one another.

class Threader extends Thread {
    
    // run() - the entry point for the thread
    public void run() {
       
        try {
            Thread.sleep(1000);
            // currentThread() - returns a reference to the Thread instance executing currentThread().
            System.out.println(Thread.currentThread().getName()+" is: "+Thread.currentThread().getState());
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        
        
    }
    
    
}