import java.util.Scanner;

public class PerfectNumberNth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int loop=1,out=0;
        for (int i = 1; loop<=n ; i++) {
            int sum=0;
            for (int j = 1; j < i; j++) {
                if (i%j==0){
                    sum+=j;   
                }
            }
            if (sum==i){
                out =i;
                loop++;
            }
        }
        System.out.println(out);
        sc.close();
    }
}
