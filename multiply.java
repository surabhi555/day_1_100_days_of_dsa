public class multiply {


    public static int multiply(int num1,int num2){
        return num1*num2;
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        int prod=multiply(a, b);
       
        System.out.println("Product of "+a+" and "+b+" is "+prod);
        prod=multiply(10,29);
        System.out.println("Product of 10 and 29 is "+prod);

    }
}
