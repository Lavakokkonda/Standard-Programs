package Zeneral;

import java.util.Scanner;

public class SmallestDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int small = n%10;// first store the last value and compare others
        while (n!=0){
            int rem = n%10;
            if (rem<small){
                small = rem;
            }
            n=n/10;
        }
        System.out.println(small);
        sc.close();
    }
}
