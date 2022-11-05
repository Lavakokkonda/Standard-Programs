package FibonacciSeries;

public class FibonacciSeriesReverse {
    public static void main(String[] args) {
        int a=0,b=1,c=0;
        int val=0;
        for(int i=1;i<=10;i++){
            c=a+c;
            if (i==9){
                val+=c;
            }
            a=b;
            b=c;
        }
        int a1=c,b1=val,c1=0;
        for (int i = 1; i <=10; i++) {
            c1=a1;
            a1=b1;
            b1=c1-a1;
            System.out.println(c1);

        }
    }
}
