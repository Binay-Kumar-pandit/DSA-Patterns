import java.util.Scanner;

class Butterfly {
    public static void main(String[] args) {
        System.out.println("Welcome to Butterfly Pattern");
        System.out.print("Enter the size of the Butterfly:");
        Scanner input=new Scanner(System.in);
        int row=input.nextInt();
        for(int i=1; i<=row; i++){
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int k = 1; k <=2*(row-i); k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=row; i>=1; i--){
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int k = 1; k <=2*(row-i); k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //it is also right
//        for(int i=0; i<=row; i++){
//            for (int k = 1;  k<= row-i; k++) {
//                System.out.print("* ");
//            }
//            for (int k = 1; k <=2*i; k++) {
//                System.out.print("  ");
//            }
//            for (int k = 1; k <=row-i ; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
