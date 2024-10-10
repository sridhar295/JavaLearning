import java.lang.System;
import java.util.Scanner;
public class LoopingStatements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // for(int i = 0 ; i<=num ; i++){
        //     System.out.println(i);
        // }

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // for(int i = a ; i <=b; i++){
        //     System.out.println(i);
        // }

        int a = sc.nextInt();
        for(int i = 0;i<=a;i++){
            if(i%2 == 0){
                System.out.println(i +"These are the even numbers");
            }
            else{
                System.out.println(i + "These are the non even numbers");
            }
        }
    }
    
}

