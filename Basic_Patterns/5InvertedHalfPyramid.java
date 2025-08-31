package V5_BasicPatterns;

import java.util.Scanner;

class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of row:");
        int r=input.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=r-i; j>=1; j--){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
