package ArmStrong;

import java.util.Scanner;

public class ArmStrongNth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int loop=1;
        int out=0;
        for (int i = 1; loop<=n; i++) {
            int sum=0,count=0;
            int bi=i;
            while (i!=0){
                int rem = i%10;
                count++;
                i=i/10;
            }
            i=bi;
            while (i!=0){
                int res=1;
                int rem = i%10;
                for (int j = 1; j <= count ; j++) {
                    res*=rem;
                }
                sum+=res;
                i=i/10;
            }
            i=bi;
            if (sum==i){
                out=i;
                loop++;
            }
        }
        System.out.println(out);
    }
    
}
