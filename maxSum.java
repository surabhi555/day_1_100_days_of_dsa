public class maxSum {
    public static void maxSum(int [] numbers){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int [] prefix=new int[numbers.length];
        prefix[0]=numbers[0];
        //calculated prefix sum
        for(int i=1;i<numbers.length;i++){
            prefix[i]=numbers[i]+prefix[i-1];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=0;j<numbers.length;j++){
                int end=j;
                currentSum=0;
                currentSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }

            }
        }
        System.out.println("maximum sum is "+maxSum);

    }
    public static void main(String[] args) {
        int [] numbers={1,2,3,4};
        maxSum(numbers);
    }
}
