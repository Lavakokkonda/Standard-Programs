package StrongNumber;

import java.util.Scanner;

public class StrongNumberNth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int loop=1;
        int out=0;
        for (int i = 1; loop<=n; i++) {
            int sum=0;//inside for loop
            int bi=i;
            while(i!=0){
                int fact=1;
                int rem =i%10;
                for (int j = rem; j>=1; j--) {
                    fact= fact*j;
                }
                sum=sum+fact;
                i=i/10;
            }
            i=bi;
            if (i==sum){
                out = i;
                loop++;
            }
        }
        System.out.println(out);
        
    }
    
}
