package day1_hw;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int evenSum=0;int oddSum=0;
        while(n>0){
            int lastDigit=n%10;
            if(lastDigit%2==0){
                evenSum+=lastDigit;
            }
            else{
                oddSum+=lastDigit;
            }
            n=n/10;
        }
        System.out.println("Even Sum: "+evenSum+" "+"odd sum"+oddSum);
    }
}
