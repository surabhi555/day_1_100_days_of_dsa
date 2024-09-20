public class invertedHalfPyramid {

public static void invertedHalfPyramid(int totRows){
    for(int i=1;i<=totRows;i++){
        for(int j=1;j<=totRows-i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    
}

public static void main(String[] args) {
    invertedHalfPyramid(5);
}
    
}