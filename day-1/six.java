import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int lastDigit=n%10;
            System.err.print(lastDigit);
            n=n/10;
        }
    }
}
