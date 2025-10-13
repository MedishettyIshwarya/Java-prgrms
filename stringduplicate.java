//find string duplicates from given array
public class stringduplicate {
    public static void main(String[] args) {
        String arr[]={"ishu","medhi","ishu","abc","xyz","abc"};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicate string is:"+arr[i]);
                }
                    
            }
        }
        
    }
    
}
