// swap two numbers
public class Main{
    public static void main(String[] args){
        int a=5;
        int  b=6;
        System.out.println("Before swapping: "+a+" "+b);
         // Swapping using a temporary variable
        //  int temp=a;
        //  a=b;
        //  b=temp;

        //swapping without using a temporary variable
        //  a=a+b;
        //  b=a-b;
        //  a=a-b;

        // swaping using bitwise XOR
        // a=a^b;
        // b=a^b;
        // a=a^b;
        
        // swapping using multiplication and division
        // a=a*b;
        // b=a/b;
        // a=a/b;

        // swapping  in one line
        a=(a+b) -(b=a);


        System.out.println("After swapping: "+a+" "+b);
    }
}