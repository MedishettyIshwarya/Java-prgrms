//highest element in array
public class maxelement {
    public static void main(String[] args) {
        int arr[]={1,2,4,8};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum element in array is: "+max);
        
    }

    
}
