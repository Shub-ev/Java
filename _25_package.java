// package us used to manage large amout of java files & code & reduce complexity
// pakage is just simple folder which holds java classes

//importing package
// import _25_package_.File1;   // instead of importing one by one 
// import _25_package_.File2;  

import _25_package_.*;  // import all

// by default we have  *****  import java.lang.*;  *****  hence we can use String and other classes
//  import java.lang.*;    // import all the files only ******* so if we want subfolder we have to specify it so java.*; will not work


public class _25_package {
    public static void main(String args[]){
        File1 f1 = new File1();
        f1.f1();

        File2 f2 = new File2();
        f2.f2();
    }
}
