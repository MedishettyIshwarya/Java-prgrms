//factorial of a number 
//5!=5*4*3*2*1=120//descending order
//5!=1*2*23*4*5=120//ascending order
public class factorialnum {
    public static void main(String[] args) {
        int num=5;
        long factorial=1;
        //ascending order
        /*for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }*/
        //descending order
        for(int i=num;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);

    }

    
}
