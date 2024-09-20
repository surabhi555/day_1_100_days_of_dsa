public class invertedTriangle {

    public static void invertedTriangle(int totRows){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totRows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        invertedTriangle(4);
    }
}
