public class Star1 {
    public static void main(String[] args) {
        int n =5;
//how many lines
        for (int i = 0; i < n; i++) {
            //stars and space per row
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            // go to next line
            System.out.println();
        }
        //lines to print stars and space
        for (int i = 0; i < n-1; i++) {
            //stars and space oer row
            for(int j=-1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=2*i-1; j <n-1; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
