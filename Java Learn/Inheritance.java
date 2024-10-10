class Virat {
    int cent = 100;
}

class Sri extends Virat {
    int sri;
}

public class Inheritance {

    public static void main(String[] args) {

        Sri s = new Sri();
        System.out.println(s.cent); // Accesses 'cent' from the superclass 'Virat'

    }

    // Use extends when you want to inherit from a superclass or an interface (extending an existing behavior).
    // Use implements when you are implementing the behavior of an interface.

    // Types of inheritance
    // 1.single - one super class and drived class
    // 2.multilevel - one super class and many drived class
    // 3.Hierarchical - one super drived by 2 sub class
    // 4.Hybrid - followed by both 2 and 3


    // key word - super
    
    // super is used for to acess the parent class details into the child class

    // abstract method and class
    // abstract method should be only in abstract class and no body provided for that abstarct method
    // abstract class should be overide in child class


//     Abstract Class
// 1. abstract keyword
// 2. Subclasses extends abstract class
// 3. Abstract class can have implemented methods and 0 or more abstract methods
// 4. We can extend only one abstract clasS

// 1. interface keyword
// 2. Subclasses implements interfaces
// 3. Java 8 onwards Interfaces can have default and static methods
// 4. We can implement multiple interfaces

}
