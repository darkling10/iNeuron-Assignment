public class Assignment_1_Q5 {
    public static void main(String[] args) {
        int n=14;

        for (int i=0;i<n/2;i++){
            if(i==0 ) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for (int j=n/2;j>i;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }


        for (int i=1;i<=n/2;i++){
            if(i==n/2 ) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for (int j=i;j>=0;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
