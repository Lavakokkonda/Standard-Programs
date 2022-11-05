package ArmStrong;

import java.util.Scanner;

//Armstrong number is a number that is equal to the sum of cubes of its digits. 
//For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
//371 is an Armstrong number, since ! 3**3 + 7**3 + 1**3 = 371.
public class ArmStrongOrNot {
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int bn=n;
        int rem,sum=0;
        while (n!=0){
            rem = n%10;
            count++;
            n=n/10;
        }
        n=bn;// mandatory
        while (n!=0){
            rem = n%10;
            int out=1;
            for (int i = 1; i <= count; i++) {
                out = out*rem;
            }
            sum= sum+ out;
            n=n/10;
        }
        n=bn;// mandatory because original value is changed
        if (n==sum){
            System.out.println(n+" is a ArmStrong Number");
        }
        else{
            System.out.println(n+ " is not a armstrong Number");
        }
    }
    
}
