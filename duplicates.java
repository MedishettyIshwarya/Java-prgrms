//find duplicates from given array
public class duplicates {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,5};
        int dup=0;
        boolean status=false;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                dup=arr[i];
                status=true;
            }
            
        }
        if(status==false){
            System.out.println("no duplicate element");
            
        }
        System.out.println("duplicate element is:"+dup);
        
    }
    
}
