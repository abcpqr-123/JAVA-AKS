import java.util.Scanner;
 class StringUserInput {
    
      public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println(name);
         
      }
}

// Output:
// Enter your name: 
// Surya
// Surya