//     >, <, >=, ==, !=

import java.util.Scanner;
class conditionalStatements{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        
        if (age > 18){
       System.out.println("You can Vote");
        }else{
       System.out.println("You can't vote!");
        }
    }

  }


//   Output:
// Enter your age!
// 34
// You can Vote


//-------------------------------------------------------



class Surya {
   public static void  main (String[]args){
       
       System.out.println(19 > 18);  
       // Output:
       // true
       System.out.println(19 < 18);  
       // Output:
       // false
       System.out.println(19 <= 18);
       // Output: 
      //  true

       System.out.println(19 >= 18);
       // Output:
      //  true
       System.out.println(19 != 18);
       // Output:
      //  true

      System.out.println(19 == 18);
      // Output:
       // false
   }
}





//----------------------------------------------------------------------------------



