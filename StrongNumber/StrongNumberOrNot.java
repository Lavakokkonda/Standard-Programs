package StrongNumber;

import java.util.Scanner;

//145 is strong number. Since, 1! + 4! + 5! = 145. 
public class StrongNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int bn=n;
        int sum=0;
        while(n!=0){
            int fact=1;
            int rem = n%10;
            for (int i = rem; i >=1; i--) {
                fact=fact*i;//1*5,2*5=10,10*3,...
            }
            sum = sum+fact;
            n=n/10;
        }
        n=bn;
        if (n==bn){
            System.out.println(n+" is a strong number");
        }
        else {
            System.out.println(n+" is not a strong number");
        }
        
    }
    
}
