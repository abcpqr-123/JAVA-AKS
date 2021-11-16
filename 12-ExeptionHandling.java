// To catch array index outofbond exeption:



class ExeptionHandling {
    public static void main(String[]args){

        int a[] = new int[3];

        try{
            System.out.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("There was an error!");
            System.out.println(e.getLocalizedMessage());
        }
    System.out.println("nextline");
    }
}


// Output:
// There was an error!
// Index 4 out of bounds for length 3
// nextline



//----------------------------------------------------------------------------



// To catch any exeption:


class ExeptionHandle{
    public static void main(String[]args){

        int a[] = new int[3];

        try{
            System.out.println(2/0);
        } catch (Exception e){
            System.out.println("There was an error!");
            System.out.println(e.getLocalizedMessage());
        }
    System.out.println("nextline");
    }
}


// Output:
// There was an error!
// / by zero
// nextline