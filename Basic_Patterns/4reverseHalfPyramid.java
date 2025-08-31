package V5_BasicPatterns;

import java.util.Scanner;

class reverseHalfPyramid {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of row:");
        int r=input.nextInt();
        for(int i=r; i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
