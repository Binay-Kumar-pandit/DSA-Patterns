import java.util.Scanner;
class solidRectangle{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of row:");
        int r=input.nextInt();
        System.out.print("Enter the number of culumn:");
        int c=input.nextInt();
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print("#  ");
            }
            System.out.println();
        }
    }
}