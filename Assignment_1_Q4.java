public class Assignment_1_Q4 {
    public static void main(String[] args) {

        int rows=14;
        for (int i= 1; i<= rows/2 ; i++)
        {
            for (int j=i; j <rows/2 ;j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++) {
                System.out.print("");
            }
            System.out.println("");
        }

        for (int i=rows/2; i>0; i--)
        {
            for(int j=i; j<=rows/2;j++)
            {
                System.out.print("*");
            }
            for(int k=0; k<2*(i-1);k++)
            {
                System.out.print(" ");
            }
            for(int m=i-1;m<rows/2;m++){

                System.out.print("*");
            }
            System.out.println("");


        }
        for (int i=0;i<14;i++){
            System.out.print("*");
        }
    }
}
