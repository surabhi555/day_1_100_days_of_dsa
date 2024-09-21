public class largestElement {

    public static int getLargestElement(int []arr){

        int largest=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,78};
        int largest=getLargestElement(arr);
        System.out.println("Largest element in the array is: "+largest);
    }
}
