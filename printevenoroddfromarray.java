//printing even and odd num grom the given array
public class printevenoroddfromarray{
    public static void main(String[] args) {
        int arr[]={1,8,5,6,9,0};
        /*System.out.println("even num:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("odd num:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }*/
        //enhanced for loop
        System.out.println("even num:");
        for(int value:arr){
            if(value%2==0){
                System.out.println(value);
            }
        }
        System.out.println("odd num:");
        for(int value:arr){
            if(value%2!=0){
                System.out.println(value);
            }
        }
    }
}