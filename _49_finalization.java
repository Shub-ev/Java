public class _49_finalization{
    public static void main(String[] args) {
        Test t = new Test();
        t = null;
    }
}

class Test{
    Test(){
        System.out.println("Constructor call!");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Test object " + this.toString() + "\t is destroyed!");
    }
}