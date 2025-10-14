//find string duplicates from given array

import java.util.HashSet;

public class stringduplicate {
    public static void main(String[] args) {
        String arr[]={"ishu","medhi","abc","xyz","abc"};
        /*for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicate string is:"+arr[i]);
                }
                    
            }
        }*/
        //using hashset 
        
        HashSet <String> dup=new HashSet();
        /*System.out.println(dup.add("ishu"));
        System.out.println(dup.add("medi"));
        System.out.println(dup.add("ishu"));*/
       //find string duplicates from given array
    //    for(String s:arr){
    //      System.out.println(dup.add(s));
    //    }



       
        boolean status = false; 

        for (int i = 0; i < arr.length; i++) {
            if (dup.add(arr[i]) == false) {
                System.out.println("duplicate string is:" + arr[i]);
                status = true;
            }
        }
        if (status == false) {
            System.out.println("no duplicate string");
        }
    }
}

    
    

