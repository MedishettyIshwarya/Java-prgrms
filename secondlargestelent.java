public class secondlargestelent {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,7,10};
        int max1=0;
        int max2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            
            }else if(arr[i]>max2 && arr[i]!=max1){
                max2=arr[i]; 

            }
        
            
        }
        System.out.println("second largest element is: "+max2);

    }
    
}
