import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        // reverse number using algorithm
        /*int rev=0;
        while(num!=0){
            rev=rev*10 + num%10;//0*10 + 1234%10=4 rev=4+0=4,4*10=40+123%10=3=40+3=43
            num=num/10;// 1234/10=123 , 123/10=12
            System.out.println("reversed number:"+rev);*/

            //reverse using stringbuffer
        //     StringBuffer sb= new StringBuffer (String.valueOf(num));
        //    StringBuffer rev= sb.reverse();
        //    System.out.println("Reversed number: " + rev);

        //reverse using string builder
        StringBuilder sb=new StringBuilder();
        sb.append(num);
        StringBuilder rev = sb.reverse();
        System.out.println("reversed number:"+rev);

        }
    }

