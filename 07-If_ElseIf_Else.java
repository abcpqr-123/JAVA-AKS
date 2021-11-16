import java.util.Scanner;

class IfElse {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the grade: ");

        char grade = sc.next().charAt(0);
         
        if (grade == 'A'){
            System.out.println("Your grade is very good");
        } else if (grade == 'B') {
            System.out.println("very good, keep learning");
        } else if (grade == 'C') {
            System.out.println("Keep improving!");
        } else {
            System.out.println("In valid Input.");
        }

    }
        
}


// Output:
// Enter the grade: 
// A
// Your grade is very good

// Enter the grade: 
// B
// very good, keep learning