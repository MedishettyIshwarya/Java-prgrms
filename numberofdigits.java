// count number of digits 
//ex num = 12345 no of digits=5

public class numberofdigits {
    public static void main(String[] args){
        int num=12345;
        int count=0;
        while(num>0){
            num = num/10;//12345/10=1234,1234/10=123,123/10=12,12/10=1,1/10=0 , 0>0 so breaks the loop
            count++;//1,2,3,4,5
        }
        System.out.println("enter the number of digits:"+count);

    }
    
}
