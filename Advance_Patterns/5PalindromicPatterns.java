package V6AdvancePatterns;

class PalindromicPatterns {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindromic Patterns!");
        int n=5;
//        int counter=5;
//        for(int i=1; i<=n; i++){
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print("  ");
//                counter--;
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(counter+" ");
//                counter--;
//            }
//            counter=1;
//            for (int j = 1; j <i ; j++) {
//                counter++;
//                System.out.print(counter+" ");
//
//            }
//            System.out.println();
//            counter=5;
//        }

        //without counter
        for(int i=1; i<=n; i++){
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j>=1 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}
