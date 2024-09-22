public class maxSubarraySub {
    public static void maxSubarraySub(int []numbers){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=0;j<numbers.length;j++){
                int end=j;
                curSum=0;
                for(int k=start;k<numbers.length;k++){
                    curSum+=numbers[k];
                }
                System.out.println("sum "+curSum);
                if(curSum>maxSum){
                    maxSum=curSum;
                }
            }
        }
        System.out.println("maxSum :"+maxSum);
    }
    public static void main(String[] args) {
        int [] numbers={1,2,3};
        maxSubarraySub(numbers);
    }
}
