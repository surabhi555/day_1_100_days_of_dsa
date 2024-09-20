public class fact {

    public static int fact(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;}
            return fact;
    }
    public static void main(String[] args) {
        System.out.println(fact(7));
    }
}
