//check largest among two numbers 
import java.util.Scanner;
public class largestamongtwonumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=sc.nextInt();

        System.out.println("enter the second  number");
        int num2=sc.nextInt();

        System.out.println("enter the third number");
        int num3=sc.nextInt();
        // if(num1>=num2 &&num1>=num3){
        //     System.out.println("largest number is:"+num1);
        // }else if(num2>=num1&&num2>=num3){
        //     System.out.println("largest number is:"+num2);
        // }else{
        //     System.out.println("largest number is:"+num3);
        // }

        //approach 2 using ternary operator
        int large1=(num1>num2?num1:num2);//if num1 is greaterit is true so its writtens num1 if num2 grater false so num2 largest
        int largest=(large1>num3?large1:num3);
        System.out.println("largest number is:"+largest);



        
    }
} 
