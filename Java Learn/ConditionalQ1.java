import java.lang.System;
import java.util.Scanner;

public class ConditionalQ1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    //  int num = sc.nextInt();
    //  if(num > 35){
    //     System.out.println("Pass");
    //  }
    //  else{
    //     System.out.println("best of luck");
    //  }
   
        
    // }
    int num = sc.nextInt();
    if(num % 5 == 0 && num % 3 == 0 ){
       System.out.println("yes");
    }
    else{
       System.out.println("no");
    }
  
       
   }
}
