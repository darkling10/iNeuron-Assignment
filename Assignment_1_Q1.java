public class Assignment_1_Q1 {

    public static void main(String[] args) {

        String name = "INEURON";

        for (int i=0;i<name.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }

    }
}
