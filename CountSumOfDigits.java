//count the sum of the digits in a number
//ex=num=1234 1+2+3+4=10
public class CountSumOfDigits {
    public static void main(String[] args) {
        int num=1234;
        int sum=0;
        while(num>0){//1234>0 so enters the loop
            sum=sum+num%10;//0+1234%10=4 4+0=4, 4+123%10=3 4+3=7,7+12%10=2 7+2=9, 9+1%10=1 9+1=10, 0>0 so breaks the loop
            num=num/10;//1234/10=123,123/10=12,12/10=1,1/10=0
        }
        System.out.println("sum of digits:"+sum);
        
    }
    
}



