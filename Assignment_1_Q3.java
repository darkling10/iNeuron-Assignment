public class Assignment_1_Q3 {

    public static void main(String[] args) {
        int rows=14;

        for (int i=1; i<= rows/2 ; i++) {

            for (int j = rows/2; j >= i ; j--) {
            System.out.print("*");
            }

            for (int k = 0; k <2*(i-1) ;k++) {
                System.out.print(" ");
            }
            if( i==1) {
                for (int j = 0; j < rows/2; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                for (int j = rows / 2; j >= i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }


        for (int i=(rows/2)-1; i>= 0 ; i--)
        {

            System.out.print("*");
            for (int k = 1; k < rows-1 ;k++) {
                System.out.print(" ");
            }
            System.out.println("*");
           if(i==0){

               for (int j = 0; j < rows; j++) {
                   System.out.print("*");
               }
               System.out.println("");
           }
//

        }
    }
}
