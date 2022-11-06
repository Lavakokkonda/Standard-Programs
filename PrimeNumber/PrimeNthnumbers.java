package PrimeNumber;

import java.util.Scanner;

public class PrimeNthnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int loop =1;
        int out =0;
        for(int i=1; loop <=n ;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                out=i;
                loop++;
            }
        }
        System.out.println(out);
    }
    
}
