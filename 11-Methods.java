class Methods {

    

    public static void main(String[]args){
        System.out.println(average(2, 6));
        System.out.println(average(8, 6));
        System.out.println(average(10, 6));
    }


  static  int average(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        return sum/2;
    }

}

// Output:
// 4
// 7
// 8