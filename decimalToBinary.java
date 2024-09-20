public class decimalToBinary {
public static void decimalToBinary(int decNum){
    int pow=0;
    int bin=0;
    int myNum=decNum;
    while(decNum>0){
        int rem=decNum%2;
        bin=bin+rem*(int)Math.pow(10,pow);
        decNum=decNum/2;
        pow++;
    }
    System.out.print("binary of "+myNum+" = "+bin);
}

    
    public static void main(String[] args) {
        decimalToBinary(20);
    }
}
