// A. Private   (access with in the same class only)
// B. Public    (access from any other class regardless of package)
// C. Protected  (access with in all classes of same package or subclasses which could be in other packages)
// D. Default/no modifier   (limits the visibility to classes with in the same package)

import _25_package_.*;

class _26_access_specifier {
    public static void main(String args[]){
        File1 f1 = new File1(); // implementing File1() from another Package // this constructor is visible bcoz it is public in that package
        // f1.file_name;  // this is not possible as file_name is default in that class hence visible to that package only;
    }
}
