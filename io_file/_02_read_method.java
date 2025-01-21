package io_file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02_read_method {
    public static void main(String[] args) throws IOException {
        char c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do{
            c = (char) br.read();       // read() method reads 1 character from stream at a time and return its int value
            System.out.println(c);
        }while(c != 'q');
    }
}
