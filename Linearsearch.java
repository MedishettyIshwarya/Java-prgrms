//Linear search or also known as sequential serch
//it is the simplest searching algorithm that checks every element in a list until the desired element is found or the list ends
//time complexity is O(n) in the worst case scenario
//space complexity is O(1) as it uses a constant amount of space
public class Linearsearch {
    public static void main(String[] args) {
        int arr[]={10,40,56,78,79};
        int search=40;
        boolean status=false;
        for(int i=0;i<arr.length;i++){
            if(search==arr[i]){
                System.out.println("element found at index:"+i);
                status = true;
                break;
            }
            
            }
            if(status==false){
                System.out.println("element not found");
            }
            else{
                System.out.println("element found");
            }
        }
        
        
    }
    

