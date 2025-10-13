//find max and min elemnt from given element
public class minandmax{
    public static void main(String[] args) {
        //max element
        /*int  arr[]={1,2,4,5,8,10};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }

        }
        System.out.println("max element is:"+max);*/

        //min element
        int arr[]={5,7,9,4,10};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min elemennt:"+min);

        
    }
}