package Threads;

// main thread loads first in execution
// all threads spawns from main thread
// main thread is last thread in execution which removes/unloads all resources

public class _01_current_thread {
    public static void main(String args[]){
        // currentThread() is used the get the ref of currently running thread!
        // it returns Thread reference
        // syntax => static Thread currentThread()   => method of Thread class

        // provides the ref currently executing thread(main thread)
        Thread currentTh = Thread.currentThread();
        System.out.println("Current Thread : " + currentTh);

        // change the name of thread
        currentTh.setName("Main Thread");
        System.out.println("Current Thread : " + currentTh);

        // thread name using getName() final method
        System.out.println("Name of thread is : " + currentTh.getName());

        try{
            for(int i = 0; i < 5l; i++){
                System.out.println("I is " + i);

                // makes thread suspend the execution for milisec
                // this method could throw InterruptedException
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main Thread Interrupted!");
        }
    }
}
