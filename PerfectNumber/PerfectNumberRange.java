
import java.util.Scanner;

public class PerfectNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter min value ");
        int min = sc.nextInt();
        System.out.println("enter max value");
        int max = sc.nextInt();
        for (int i = min; i <=max; i++) {
            int sum=0;
            for (int j = 1; j <i; j++) {
                if (i%j==0)
                sum+=j;
            }
            if (sum==i){
                System.out.println(i);
            }
        }
        
    }
    
}
