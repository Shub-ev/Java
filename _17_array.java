// array (homogeneous collection of similar datatypes saved linearly in memory)
// in array while declaring array the size of array should be mentioned or compulsory
// syntax => 
// A. int nums[] = {1,2,3,4};
// B. int nums[] = new int[5];

// default value of int array element is 0

class Student{
    int age;
    String name;
    int marks;

    public Student(int a, String n, int m){
        this.age = a;
        this.name = n;
        this.marks = m;
    };

    public String toString(){
        return "Student{name='" + name + "', age=" + age + ", marks=" + marks + "}";
    }
}

public class _17_array {
    public static void main(String args[]){


        // ******* Single dimensional array *******
        int arr[] = new int[4]; // array in java are of fixed size hence size should be known at declaration
        for(int i = 0; i < 4; i++){ // index starts with 0 for array
            System.out.println(arr[i]); // we can access the elements of array using index [_num]
        }



        // ******* Multi/Two dimensional array *******
        int arrr[][] = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arrr[i][j] = (int) (Math.random() * 10);
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arrr[i][j]+ " ");
            }
            System.out.println();
        }



        // ******* Jagged array *******
        int ar[][] = new int [3][]; // here we dont have fixed size for the arrays in array
        // but now we have to implement those different sizes for each array
        System.out.println();
        ar[0] = new int[3];
        ar[1] = new int[2];
        ar[2] = new int[4];

        for(int i = 0; i < ar.length; i++){ // getting length of array
            for(int k = 0; k < ar[i].length; k++){ // getting length of each element array
                System.out.print(ar[i][k]+ " ");
            }
            System.out.println();
        }



        // ******* Object array with enchanced for loop *******
        Student s1 = new Student(20, "Shubham", 95);
        Student s2 = new Student(22, "Akanksha", 97);
        Student s3 = new Student(21, "Harish", 80);

        Student stu[] = new Student[3]; // here we declaring the array which can hold 3 references to Student objects
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;
        
        for(Student n: stu){ // this is enhanced for loop
            System.err.println(n);       // prints toString() method of class if not present it implements default toString method of Object class
        }
    }
}
