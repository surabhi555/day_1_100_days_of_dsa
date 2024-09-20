public class binimialcoefficeint {

    public static int fact(int n){
        int Product=1;
        for(int i=1;i<=n;i++){
            Product*=i;}
            return Product;
    }

    public static int bincoeff(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);
        int binimialcoefficeint=fact_n/(fact_r*fact_nmr);
        return binimialcoefficeint;
    }
    public static void main(String[] args) {
        System.out.println(bincoeff(5,2));
    }
}
