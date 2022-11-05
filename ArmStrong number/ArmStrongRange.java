package ArmStrong;

import java.util.Scanner;

public class ArmStrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the min value ");
        int min = sc.nextInt();
        System.out.println("Enter the max value ");
        int max = sc.nextInt();
        for (int i = min; i <=max; i++) {
            int count=0;//while  using for in range everything should be in for
            int sum=0;// this too
            int bi=i;
            while (i!=0){
                int rem = i%10;
                count++;
                i=i/10;
            }
            i=bi;
            while (i!=0){
                int out=1;
                int rem = i%10;
                for (int j = 1; j <=count; j++) {
                    out=out*rem;
                }
                sum=sum+out;
                i=i/10;
            }
            i=bi;
            if(i==sum){
                System.out.println(sum);
            }
            
        }
    }
    
}
