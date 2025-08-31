package V5_BasicPatterns;

import java.util.Scanner;

class FloydsTraingle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of row:");
        int r=input.nextInt();
        int k=1;
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
