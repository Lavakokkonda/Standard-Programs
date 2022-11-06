

import java.util.Scanner;

//perfect number, a positive integer that is equal to the sum of its proper divisors.
// The smallest perfect number is 6, which is the sum of 1, 2, and 3. 
class perfectNumberOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int sum =0;
        for (int i = 1; i < n; i++) {
            if(n%i==0)
            sum+=i;
        }
        if (sum==n){
            System.out.println(n+" is a Perfect Number");
        }
        else {
            System.out.println(n+ "is not a Perfect number");
        }
    }
}