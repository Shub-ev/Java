package Threads;

class RunnableClass implements Runnable {
    Thread t;
    String name;

    public RunnableClass(String ThreadName){
        this.name = ThreadName;
        t = new Thread(this, name);
        System.out.println("Child Thread " + name);
        // t.start();       // this will instantly start thread as created
    }

    @Override
    public void run(){
        try{
            for(int i = 0; i < 5; i++){
                System.out.println("Child Thread " + this.name + ": " + i);
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Exiting Child Thread! " + name);
    }


    // method to explicitly start the thread
    public void startThread(){
        t.start();
    }
}

public class _05_3_threads {
    public static void main(String[] args) {

        // in previous this will start the thread
        // new RunnableClass("Demo1");
        // new RunnableClass("Demo2");
        // new RunnableClass("Demo3");

        RunnableClass rn1 = new RunnableClass("Demo1");
        RunnableClass rn2 = new RunnableClass("Demo2");
        RunnableClass rn3 = new RunnableClass("Demo3");

        // explicitly start the thread
        rn1.startThread();
        rn2.startThread();
        rn3.startThread();

        Thread currThread = Thread.currentThread();
        System.out.println(currThread);

        try {
            for(int i = 0; i < 5; i++){
                System.out.println("Main Thread I : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Exiting Main Thread!");
    }
}
