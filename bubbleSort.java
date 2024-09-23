public class bubbleSort {
    public static void bubbleSort(int arr []){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                //swap
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,1,2};
        bubbleSort(arr);
        printArray(arr);
    }
}
