 // +, -, *, ++,--
 
 class Operators {
    public static void main (String[]args){
        int firstNumber = 123;
        int secondNumber = 234;
       
       
        double result1 = (double)firstNumber + (double)secondNumber;
        double result2 = (double)firstNumber / (double)secondNumber;
        double result3=  (double)firstNumber * (double)secondNumber;
        double result4 = (double)firstNumber - (double)secondNumber;
       
       System.out.println(result1);
       System.out.println(result2);
       System.out.println(result3);
       System.out.println(result4);

    }
}

// Output:
// 357
// 0
// 28782
// -111



//-------------------------------------------------------------------------



class second {
   public static void main (String[]args){
           int a = 6;
           a = a++;

    System.out.println(a);
    }
}

// Output:
// 6



//------------------------------------------------------------------------------


class fourth {
    public static void main (String[]args){
            
            int a = 6;
             --a;   //Not a--
            
     System.out.println(a);
     }
 }



 //--------------------------------------------------------------------

 class third {
    public static void main (String[]args){
            
        int a = 5;
     System.out.println(++a); 
     System.out.println(a++);       
     System.out.println(a);
     }
 }


//  Output:
// 6
// 6
// 7


//-----------------------------------------------------------------------------


