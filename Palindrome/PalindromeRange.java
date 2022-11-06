package Palindrome;

import java.util.Scanner;

public class PalindromeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter min value");
        int min = sc.nextInt();
        System.out.println("enter a max value ");
        int max = sc.nextInt();
        for (int i=min; i<=max; i++){
            int bi=i;
            int rev=0;//when we are using for this should be inside
            while (i!=0){
                int rem = i%10;
                rev= rev*10+rem;
                i=i/10;
            }
            i=bi;// mandatori
            if (rev==i){
                System.out.println(rev);
            }
            
        }
    }
    
}
