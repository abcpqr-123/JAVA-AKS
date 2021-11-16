


// // for, while, do-while 



// // 1.for --> 



class Loops {
    public static void main(String[]args) {
            for (int i = 0; i<10; i++){
                 System.out.println("Surya " + i);
            }
    }
}

// Output:
// Surya 0
// Surya 1
// Surya 2
// Surya 3
// Surya 4
// Surya 5
// Surya 6
// Surya 7
// Surya 8
// Surya 9



// ------------------------------------------------------------------------






// // 2. while Loop: 





// // infinite loop using while



import java.util.Scanner;


class My {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the number: ");

        int a = sc.nextInt();

     while(true){
      System.out.println(a);
}
    }
}




// Output:
// 12
// 12
// 12
// 12
// 12
// 12
// 12
// 12
// 12




//-------------           ------------             ----------



// // Infinite loop 





import java.util.Scanner;

class Acls {
        public static void main(String[] args) {
    
            Scanner sc = new Scanner (System.in);
            
            System.out.println("Enter the number: ");
    
            int a = sc.nextInt();
    
         while(true){
          System.out.println(a);
          a++;
    }
        }
    }


//Output:
// 90
// 91
// 92
// 93


// //----------         ----------------         -----------------


// // while loop break:




import java.util.Scanner;


class work {
        public static void main(String[] args) {
    
            Scanner sc = new Scanner (System.in);
            
            System.out.println("Enter the number: ");
    
            int a = sc.nextInt();
    
         while(true){
          System.out.println(a);
          a++;
          if (a > 100){
              break;
          }
    }
        }
    }


// Output:
// 88
// 88
// 89
// 90
// 91
// 92
// 93
// 94
// 95
// 96
// 97
// 98
// 99
// 100



// //-----------------------------------------------------------------------




import java.util.Scanner;


class DoWhile {
        public static void main(String[] args) {
    
            Scanner sc = new Scanner (System.in);
            
            System.out.println("Enter the number: ");
    
            int a = sc.nextInt();
         
        do {
            System.out.println(a);
             a++;
        } while(a < 100);
        }
    }




//     Output
//     Enter the number: 
//     95
// 95
// 96
// 97
// 98
// 99





// //---------------          --------------------        ------------




// //Do while loop executes atleast once,





import java.util.Scanner;


class DoWhile {
        public static void main(String[] args) {
    
            Scanner sc = new Scanner (System.in);
            
            System.out.println("Enter the number: ");
    
            int a = sc.nextInt();
         
        do {
            System.out.println(a);
             a++;
        } while(a > 100);    //(It should be (a < 100), so the condition is false.
                                But also code will executes at least onece.
        }
    }


// output:
// Enter the number: 
// 96
// 96




// //-----------------------------------------------------------------------------





// // Continue:





import java.util.Scanner;

class DoWhile {
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner (System.in);
            
            System.out.println("Enter the number: ");
                
            int a = sc.nextInt();
                     
            
         
        while (a  <= 10) {
            a++;
           if (a == 6) continue;
           System.out.println(a);
             
        }
    }

}


// // Output:


// Enter the number: 
// 1
// 2
// 3
// 4
// 5
// 7
// 8
// 9
// 10
// 11






