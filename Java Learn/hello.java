import java.lang.System;
import java.util.Scanner;
class hello {
    public static void main(String[] args) {

        // int num = 29;
        // String name = "Sri";
        // System.out.println("Hello World" + num + name);

        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = a+b;
        // System.out.println(c);

        String name = sc.nextLine();
        int num = sc.nextInt();
        System.out.println("My name is " + name);
        System.out.println("My age is " + num);


    }
}

// javac hello.java - convert english code into byte code
// Byte code Cannot understand so we are push the byte code into JVM So JVM to convert byte code into machine readable code
// to run byte code using JVM
// JVM - to convert machine readable code and excecute

// public static void main(String[] args) {
//     System.out.println("Hello World");
// }

/*without above the function java unable to run*/

/* Variables and Datatypes */

// variables - variables are the containers that will help you to store the data

// sysout where it is comes - java.lang.system added default to the system
// system.out - is direct to the terminal
// scanner - use to get the value from terminal - java.util.Scanner