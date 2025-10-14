//binary search
//it is a searching algorithm that finds the position of a target value within a sorted array
//binary search works by repeatedly dividing in half the portion of the array that could contain the target value until the possible locations are reduced to just one
//time complexity is O(log n) in the worst case scenario
//space complexity is O(1) as it uses a constant amount of space
//binary search can only be applied to a sorted array
//binary search is faster than linear search for large arrays

public class binarysearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key=9;
        int l=0;
        int h=arr.length-1;
        boolean status= false;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==key){
                System.out.println("element found at index:"+mid );
                status=true;
                break;
            }
            if(arr[mid]>=key){
                h=mid-1;
                
                
            }
            if(arr[mid]<=key){
                l=mid+1;
                
                
            }
            
        }
        if(status==false){
            System.out.println("element not found");
            
        }
        


        
    }
    
}
