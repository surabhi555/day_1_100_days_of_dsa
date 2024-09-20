public class binaryToDeicmal {
    public static void binaryToDecimal(int binNum){
        int dec=0;
        int pow=0;
        int myNum=binNum;
        while(binNum>0){
            int lastDigit=binNum%10;
            dec=dec+lastDigit*(int)Math.pow(2,pow);
            pow++;
            binNum=binNum/10;
        }
        System.out.println("binary of "+myNum+" = "+dec);
    }

    public static void main(String[] args) {
        binaryToDecimal(111);
    }
}
