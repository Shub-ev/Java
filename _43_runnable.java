// ******  Runnable  ******

class Base {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("A");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class A extends Base implements Runnable { // using Runnable interface instead Thread class bcoz we want to extend Base
    // // class and we cannot extend two classes
}

public class _43_runnable {
    public static void main(String args[]) {

        // A a = new A();
        Runnable a = new A(); // here we are creating object of Runnable reference

        Thread t = new Thread(a); // creating object of Thread class and passing Runnable obj
        t.start(); // starting the thread

        System.out.println("Runnable Object using Lambda Expression");
        // creating a Runnable using Lambda Expression
        Runnable obj = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable thread");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj);
        t1.start();

    }
}
