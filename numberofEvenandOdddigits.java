//counting no of digits  in a number that are even and odd
//ex num=1234 even=2,odd=2 
public class numberofEvenandOdddigits {
    public static void main(String[] args){
        int num=1234;
        int even_count=0;
        int odd_count=0;
        while(num>0){//1234>0 so enters the loop 
            int reminder=num%10;//1234%10=4,123%10=3,12%10=2,1%10=1,0>0 so breaks the loop
            if(reminder%2==0){//4%2=0 3%2!==0, 2%2=0, 1%2!==0
                even_count++;//1,2
                
            }else{
                odd_count++;//1,2
                


            }
            num=num/10;//1234/10=123,123/10=12,12/10=1,1/10=0
        }
            System.out.println("even numbers:"+even_count);
            System.out.println("odd numbers:"+odd_count);
    }
    
}
