package io_file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_readLine_method {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String str = br.readLine(); // return string object but also have IOException
            System.out.println(str);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
