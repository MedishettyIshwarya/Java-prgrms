//find the min and max from the array
public class minandmax {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min value is:"+min);
        System.out.println("max value is:"+max);
        
    }
    
}
