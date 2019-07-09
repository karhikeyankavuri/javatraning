public class printStar {

    public static void main(String[] args) {
        int n=7;
        printPyramid(n);

    }

    private static void printPyramid(int n) {
        for(int i=0;i<n;i++){
            for(int j=n-i; j>1; j--){
                System.out.print(" ");
            }
            for (int j=0; j<=2*i; j++ )
            {
                // printing stars
                System.out.print("*");
            }

            System.out.println();

        }
        for(int i=0;i<n;i++){
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print(" ");
            }
            for(int j=2*(n-1)-2*i; j>1; j--){
                System.out.print("*");
            }


            System.out.println();


        }

    }
}
