package V5_BasicPatterns;

import java.util.Scanner;

class zeroOneHalfPyramid {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of row:");
        int r=input.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

import java.util.*;
public class Patterns {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //1.Solid rectangle
    // SolidRectangle(sc);
    
    //2.hollow rectangle
    //HollowRectangle(sc);
    
    //3.right half pyramid
    //RightHalfPyramid(sc);
    
    //4.inverted right half pyramid
    // InvertedRightHalfPyramid(sc);
    
    //5.left half pyramid
    // LeftHalfPyramid(sc);
    
    //6.right half pyramid with num
    // RightHalfPyramidNum(sc);
    
    //7.reverse right half pyramid with reverse
    // ReverseRightHalfPyramidNum(sc);
    
    //8.Floyd's Traingle
    // FloydTraingle(sc);
    
    //9.Zero one traingle
    // ZeroOneTraingle(sc);
    
    //last but cool heart pattern
    // Heart(sc);
  }
  //1.Solid Rectangle
  public static void SolidRectangle(Scanner sc){
      System.out.print("Enter height:");
      int height=sc.nextInt();
      System.out.print("Enter width:");
      int width=sc.nextInt();
      for(int i=0; i<height; i++){
          for(int j=0; j<width; j++){
              System.out.print("*  ");
          }
          System.out.println();
      }
  }
  //2.Hollow Rectangle
  public static void HollowRectangle(Scanner sc){
      System.out.print("Enter height:");
      int height=sc.nextInt();
      System.out.print("Enter width:");
      int width=sc.nextInt();
      for(int i=0; i<height; i++){
          for(int j=0; j<width; j++){
              if(i==0 || i==height-1 || j==0 || j==width-1){
                  System.out.print("*");
              }else{
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
  }
  //3.Right Half Pyramid
  public static void RightHalfPyramid(Scanner sc){
      System.out.print("Enter height of Pyramid:");
      int height=sc.nextInt();
      for(int i=1; i<=height; i++){
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
      }
  }
  //4.InvertedRightHalfPyramid
  public static void InvertedRightHalfPyramid(Scanner sc){
      System.out.print("Enter height:");
      int height=sc.nextInt();
      for(int i=1; i<=height; i++){
        for(int j=i; j<=height; j++){
            System.out.print("* ");
        }   
        System.out.println();
      }
  }
  //5.Left half pyramid
  public static void LeftHalfPyramid(Scanner sc){
      System.out.print("Enter the height:");
      int height=sc.nextInt();
      for(int i=1; i<=height; i++){
          for(int j=i; j<=height; j++){
              System.out.print("  ");
          }
          for(int j=1; j<i; j++){
              System.out.print("* ");
          }
          System.out.println();
      }
  }
//   6.Right Half Pyramid with Number
  public static void RightHalfPyramidNum(Scanner sc){
      System.out.print("Enter the height:");
      int height=sc.nextInt();
      for(int i=1; i<=height; i++){
          for(int j=1; j<=i; j++){
              System.out.print(j+" ");
          }
          System.out.println();
      }
  }
  
  //   7.Reverse Right Half Pyramid with Number
  public static void ReverseRightHalfPyramidNum(Scanner sc){
      System.out.print("Enter the height:");
      int height=sc.nextInt();
      for(int i=1; i<=height; i++){
          for(int j=i,k=1; j<=height; j++,k++){
              System.out.print(k+" ");
          }
          System.out.println();
      }
  }
  //8.Floyd's trangle
  public static void FloydTraingle(Scanner sc){
      System.out.print("Enter height:");
      int height=sc.nextInt();
      for(int i=1,k=1; i<=height; i++){
          for(int j=1; j<=i; j++,k++){
              System.out.print(k+" ");
          }
          System.out.println();
      }
  }
  
  //9.0-1 traingle
  public static void ZeroOneTraingle(Scanner sc){
      System.out.print("Enter the height:");
      int height=sc.nextInt();
      for(int i=1; i<=height; i++){
          for(int j=1; j<=i; j++){
              if((i+j) %2==0){
                  System.out.print("1 ");
              }else{
                  System.out.print("0 ");
              }
          }
          System.out.println();
      }
  }
  
  public static void Heart(Scanner sc){
    System.out.print("Fill char: ");
    String in = sc.nextLine();
    char ch = in.isEmpty() ? 'A' : in.charAt(0);

    int scale = 12; //heart size

    for (double y = 1.5; y > -1.5; y -= 2.0/scale) {
      StringBuilder row = new StringBuilder();
      for (double x = -1.5; x < 1.5; x += 0.8/scale) {
        double v = Math.pow(x*x + y*y - 1, 3) - x*x*Math.pow(y, 3);
        row.append(v <= 0 ? ch : ' ');
      }
      System.out.println(row.toString());
    }
  }
  
  
}
