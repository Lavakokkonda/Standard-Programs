import java.util.Scanner;
//https://www.w3resource.com/w3r_images/java-basic-image-exercise-22.png
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary number");
        int n = sc.nextInt();
        int sum=0;
        int k=1;
        while(n!=0){
            int rem = n%10;
            int res = k*rem;
            sum = sum+res;
            k=k*2;
            n=n/10;
        }
        System.out.println(sum);
    }
}
