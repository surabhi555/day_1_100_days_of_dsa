public class kadanes {
    public static void kadanes(int []numbers){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("max sum is "+ms);
    }
    public static void main(String[] args) {
        int []numbers={10,20,-7,30,-3};
        kadanes(numbers);
    }
}
