//find the smith number
public class smith {
    public static void main(String[] args) {
        int num=22;//4
        int sum=0;
        //step1:find the prime factors of the given number
        for(int i=2;i<=num;i++){
            while(num%i==0){
                //step2:find the sum of digits of each prime factor
                int n=i;//2,11
                while(n>0){
                    int r=n%10;//2%10=2,11%10=1,1%10=1,0>0 so breaks the loop
                    sum=sum+r;//0+2=2,2+1=3,3+1=4
                    n=n/10;//2/10=0,11/10=1,1/10=0
                }
                num=num/i;//22/2=11,11/11=1
            }
        }
        System.out.println("sum of digits of prime factors:"+sum);
        
    }
    
}
