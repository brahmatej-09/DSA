package BitManipulation;
import java.util.Scanner;
public class Max_Continuos_SetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        int max = 0;
        while(n!=0){
            if((n&1L)!=0){
                count++;
                max = Math.max(count,max);
            }
            else count = 0;
           n =  n>>1;
        }
        System.out.println(max);
        sc.close();
    }
    
}
