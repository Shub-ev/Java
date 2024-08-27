// if type of an var is changed explicitly then it is ****** type casting ****** => int a = (int) 1234f; => 1234
// if type of var is changed during execution implicitly then it is ****** type conversion ******

public class _05_typecasting_conversion {
    public static void main(String args[]){
        int a = (int) 123.124f; // here we are type casting float to int (truncate decimal value)
        byte byt = (byte) 240; // this is also type casting but here least significant beats are stored in new var

        byte byt2 = (byte) 1234; // if number if greater than 256 then number%256 i.e. 1234/256

        System.out.println(a);
        System.out.println(byt);
        System.out.println(byt2);
    }
}
