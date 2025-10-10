//generating random number and string
import java.util.Random;
public class generaterandomnumandstring {
    public static void main(String[] args) {
        //approach 1
        Random rand=new Random();
        int rand_int=rand.nextInt(100);
        System.out.println(rand_int);
        //approach 2
        double rand_num= rand.nextDouble(1000);
        System.out.println(rand_num);
        //approch 3
        System.out.println(Math.random());
        //random string
        StringBuilder sb=new StringBuilder();
        String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for(int i=0;i<10;i++){
            int index=rand.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

    }
    
}
