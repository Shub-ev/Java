
enum Laptop{    // here we are declaring enum constants with values
    MacBook(2000), Victus(1600), Lenovo(1500), Asus;

    private int price;

    // if we want const without values we should create default constructors
    // constructors are called for each constant we create/use
    private Laptop(){
    }

    private Laptop(int price){      // constructor to sent the price to constants
        this.price = price;
    }

    public int getPrice() {
        return price;
    }    
}

public class _36_enum_class {
    public static void main(String args[]){
        Laptop lp = Laptop.Asus;
        System.out.println(lp.getPrice());


        Laptop[] lps = Laptop.values();
        for(Laptop l : lps){
            System.out.println(l + " " + l.getPrice());
        }
    }
}
