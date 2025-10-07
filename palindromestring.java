//palindrome string
import java.util.Scanner;
public class palindromestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        String org_str=str;
         String rev=" ";
        int len =str.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if(org_str==rev){
            System.out.println("string is a palindrome"+org_str);
        }else{
            System.err.println("string is not a palindrome:"+org_str);
        }

        
    }
    
}
