package Strings;
import java.util.*;
public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        boolean flag = true;g
        for(int i=0;i<str1.length();i++){
            int one = (int)str1.charAt(i);
            int two = (int)str2.charAt(i);
            if(one<two){
                flag = false;
                System.out.println(-1);
                break;
            }
            else if(one>two){
                flag = false;
                System.out.println(1);
                break;
            }
            else continue;
        }
        if(flag) System.out.println(0);
        sc.close();
    }
    
}
