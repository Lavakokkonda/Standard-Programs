package StrongNumber;

import java.util.Scanner;

public class StrongnumberRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a min value ");
        int min = sc.nextInt();
        System.out.println("Enter max value");
        int max = sc.nextInt();
        for (int i = min; i <= max; i++) {
            int bi=i;
            int sum=0;
            while (i!=0){
                int fact=1;
                int rem = i%10;
                for (int j = rem; j >=1; j--) {
                    fact=fact*j;
                }
                sum=sum+fact;
                i=i/10;
            }
            i=bi;
            if (sum==i)
            System.out.println(i);
        }
    }
    
}
