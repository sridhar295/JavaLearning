public class oops {

    // class ---> blue print of object;
    // objects ---> instance of class

    String i = "I";
    String Love = "Love";
    String you = "You";

    // using function

    int sum(int a, int b) {
        return a + b;
    }

    // method overloading
    // same method name but different parameters
    // examples
    // int sum(){
    // return a+b;
    // }

    // public static void main(String[] args) {
    // oops propose = new oops();
    // propose.sum(29, 29);
    // System.out.println(propose.i);
    // System.out.println(propose.Love);
    // System.out.println(propose.you);
    // }

    // Constructors

    // A Constructors in java is a special method that is used to intiallize object
    // The contructors is called when an object of a class is created
    // constructors is nothing but it is a function
    // it has no return type
    // constructor name should the class name

    // examples

    int marks;
    String name;

    // constructor overloading and function overloading are same 

    oops() {
        System.out.println("Hi"); // default constructor or non parameterised contructor
    }

    oops(int marks) {
        this.marks = marks; // this keyword refers to the current object in a method or constructor
                            // the most common use of the this keyword is to eliminate the confusion between  class attributes and parameters with the same name 
        System.out.println("Hi"); // parameterised contructor
    }

    public static void main(String[] args) {
        oops constructor = new oops();
        oops pconstructor = new oops(10);
    }

}
