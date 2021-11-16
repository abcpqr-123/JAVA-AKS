import java.util.Scanner;

 class SwitchCases {

    public static void main(String[]args){
        
    Scanner sc = new Scanner(System.in);

     System.out.println("Enter the grade: ");
     
     char grade = sc.next().charAt(0);

     switch (grade) {
         case 'A':
         System.out.println("Very Good");
         break;
         
         case 'B':
         System.out.println("Keep Practicing");
         break;

         case 'C':
         System.out.println("Keep Practicing, need to improve more!");
         break;

         default:
         System.out.println("Invalid Input");
         break;

     }

    }
}

// Output:
// Enter the grade: 
// A
// Very Good