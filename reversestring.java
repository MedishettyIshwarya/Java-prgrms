public class reversestring {
    public static void main(String[] args){
        String str = "ishu";
        String rev=" ";
        //int len=str.length();//4
        //  1.reverse using  (string concatination) + operator
        /*for(int i=len-1; i>=0; i--){//4>=0 i=4;i--=3 3>=0 i=3, i--=2>=0 i=2, i--=1>=0 i=1 ,i--=-1<=0 so stop the loop
            rev=rev+str.charAt(i);//i=4=D , i=3=C i=2=B i=1=A
            System.out.println("Reversed string:"+rev);*/

            //2. reverse string using character array
            char arr[]=str.toCharArray();
            int len =arr.length;
            for(int i=len-1;i>=0; i--){//i=4-1=3 3>=0 i=3, i-- i=2>=0 i=2
                rev=rev+arr[i];//i=3=D, i=2=C
                System.out.println("Reversed string using character array: " + rev);


                // //3. reverse the string using string buffer
                // StringBuffer sb= new StringBuffer(str);
                //  System.out.println(sb.reverse());
                 //4. reverse the string using string builder
                    StringBuilder sb1 = new StringBuilder(str);
                    System.out.println("Reversed using StringBuilder: " + sb1.reverse());
            }

        }
    }
    

