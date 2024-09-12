// ***** Threads *****

class A extends Thread{     // extending thread class to create new thread
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("A");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("B");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }      // we can make threads to wait for certain time(miliseconds) 
        }
    }
}

public class _42_threads {
    public static void main(String args[]){
        A a = new A();
        B b = new B();

        System.out.println(a.getPriority());   // prints the priority of the current thread (0 to 10) ( 5 is default )
        System.out.println(b.getPriority());   // prints the priority of the current thread (0 to 10) ( 5 is default )

        a.setPriority(10);      // setting the priority of thread // but it is also CPU/Schedular dependant

        a.start();
        b.start();
    }
}
