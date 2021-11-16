 // Logical Opertors are:  &&, ||, !


// Operator: && -->


import java.util.Scanner;

 class LogicalOperators {
    public static void main(String[]args){
          
      Scanner sc = new Scanner (System.in);

        System.out.println("Enter your age: ");
         
        int age = sc.nextInt();

        if (age > 18 && age < 50){
            System.out.println("You can vote!");
        }else{
            System.out.println("You cannot vote!");
        }
    }


}

// Output:
// Enter your age: 
// 50
// You cannot vote!


//--------------------------------------------------------------------------



// Operator: || -->

 import java.util.Scanner;

 class BoardExam {
     public static void main (String[]args){
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter your class: ");
         
         int Standered = sc.nextInt();

         if(Standered == 12 || Standered == 10 ){
            System.out.println("You can give board exam. ");
         }else{
            System.out.println("You cannot give board exam. ");
         }


     }
 }

//  Output:
//  Enter your class: 
// 10
// You can give board exam. 


// Enter your class: 
// 6
// You cannot give board exam. 




//------------------------------------------------------------------------------





// Operator: ! -->


 import java.util.Scanner;

 class NotOperator {
    public static void main(String[]args){
          
      Scanner sc = new Scanner (System.in);

        System.out.println("Enter your age: ");
         
        int age = sc.nextInt();

        if (!(age > 18)){
            System.out.println("You can vote!");
        }else{
            System.out.println("You cannot vote!");
        }
    }


}

// Output:
// Enter your age: 
// 1
// You can vote!