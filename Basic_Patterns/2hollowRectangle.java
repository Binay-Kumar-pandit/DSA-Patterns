package V5_BasicPatterns;

import java.util.Scanner;

class hollowRectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the numbers of row==column:");
        int r=input.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r; j++){
//                if(i==1 || i==r){
//                    System.out.print("*  ");
//                }
//                else if(j==1 || j==r) {
//                    System.out.print("*  ");
//                }
                //easy way
                if(i==1 || j==1 || j==r || i==r){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
