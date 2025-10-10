//chck whether the given two arrays are eual or not
import java.util.Arrays;
public class checkarraysareequal{
    public static void main(String[] args) {
        int ar1[]={1,2,49,7,8,0};
         int ar2[]={1,2,49,7,8};

        //approach 1 using eqalls method
        /*Boolean status = Arrays.equals(ar1,ar2);
        if(status==true){
            System.out.println("arrays are equal");
        }
        else{
            System.out.println("arrays are not equal");
        }*/

        //approach 2 without using equals method
        Boolean status=true;
        if(ar1.length==ar2.length){
            for(int i=0;i<ar1.length;i++){
                if(ar1[i]!=ar2[i]){
                    status=false;
                }else{
                    status=true;
                }
            }

        }else{
            status=false;

        }
        if(status==true){
            System.out.println("arrays are equal");
        }
        else{
            System.out.println("arrays are not equal");
        }


        
    }
}
    