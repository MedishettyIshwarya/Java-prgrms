//sum of digits of given array
//ex num=12345 sum of digits=1+2+3+4+5=15
public class sumofdigits{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,1};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        //enhanced for loop
        // for(int i:arr){
        //     sum=sum+i;
        // }
        System.out.println(sum);
        
    }

}