package Palindrome;

import java.util.Scanner;

public class PalindromeNth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n= sc.nextInt();
        int loop =1;
        int out=0;
        for (int i = 1; loop<=n ; i++) {
            int rev =0;
            int bi=i;
            while(i!=0){//i!=0
                int rem = i%10;
                rev = rev*10+rem;
                i=i/10;
             }
             i=bi;
             if (rev==i){
                out = i;
                loop++;
             }
        }
        System.out.println(out);
    }
    
}
