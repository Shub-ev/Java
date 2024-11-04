package _25_package_;

public class File2 {

    public void f2(){
        System.out.println("This is File2 from Package/Folder _25_package_");
    }

    public void tryF1(){
        File1 f1 = new File1();
        String temp = f1.file_name;
        System.out.println(temp);
    }
}
