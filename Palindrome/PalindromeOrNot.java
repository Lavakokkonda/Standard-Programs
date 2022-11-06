package Palindrome;

import java.util.Scanner;

//reverse of the number should be same then it is palindrome
//reverseNum = reverseNum * 10 + (number % 10)
//example:121,151
public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int backup=n;//storing the n value to compare
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        n=backup;//using the stored value
        if (rev==n){
            System.out.println(n+" is a palindrome number ");
        }
        else {
            System.out.println(n+" is not a palindrome number");
        }
    }
}
