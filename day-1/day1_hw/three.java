package day1_hw;

public class three {
    public static void main(String[] args) {
       int n=5;
       int fact=1;
       for(int i=n;i>0;i--){
        fact*=i;
       }
       System.out.println("Factorial of "+n+" is "+fact);

    }
}
