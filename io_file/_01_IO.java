package io_file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// import java.io.BufferedInputStream;

// java does its IO using Streams
// Stream is abstraction for which it either produces or consumes information
// Stream is attached to physical io device and all streams behave same even device differ
// output stream may refer to console, disk file, network connection

// java 2 defines 2 types of streams
// 1. Byte Stream   =>  reading/writing binary data, 
// 2. Character Stream  =>  i/o of unicode characters, unicode hence can be internationalized & more efficient


// A.  Byte Oriented Stream
// byte streams are difined using 2 class hierarchies => 
// 1. two abstract classes at top   1. InputStream  2. OutputStream
// java have sevral concrete subclasses of these abstract classes
// these classes implements importat read() write() methods which are used by diff subclasses for diff devices


// B.  Character Stream
// this is based on  1. Reader  2. Writer  two abstract classes and these handles unicode chars streams
// java have concrete subclasses of these abstract classes
// Reader and Write abstract classes have read() and write() important methods which read and write characters of data


// java.lang is imported by default by compiler which imports System class which encapsulates several aspects
// of runtime environment 
// System also contains three predefined stream variables in,out,err (public and static)
// there are byte streams
// System.out refers to standard output stream (console by default) object of OutputStream
// System.in refers to standard input stream (keyboard by default)  object of InputStream
// System.err referes to standard error stream (console by default) object of InputStream
// if required you can wrap these within character based streams

public class _01_IO {
    public static void main(String[] args) throws IOException {
        // BufferedReader for console input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(str);
    }
}