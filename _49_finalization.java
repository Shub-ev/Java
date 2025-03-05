public class _49_finalization{
    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        t = null;
        System.gc();
        Thread.sleep(3000);
    }
}

class Test{
    Test(){
        System.out.println("Constructor call!");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Test object " + this.toString() + " is destroyed!");
    }
}