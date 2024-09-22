public class reverseArray{
    public static void reverseArray(int []numbers){
        int first=0;
        int last=numbers.length-1;
        while(first<last){
            int temp=numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;
            first++;
            last--;
        }
        
    }

    public static void main(String[] args) {

        int []numbers={10,20,30,40,50};
        reverseArray(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}