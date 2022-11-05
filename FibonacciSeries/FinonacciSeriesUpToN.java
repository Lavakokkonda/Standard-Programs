package FibonacciSeries;

import java.util.Scanner;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233 ...
public class FinonacciSeriesUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int a=0,b=1,c=0;
        for (int i = 1; i <=n; i++) {
            c=a+c;
            a=b;
            b=c;
            System.out.print(c+",");
        }
    }
    
}
