package V6AdvancePatterns;

class DiamondPattern {
    public static void main(String[] args) {
        System.out.println("Welcome to diamond patterns!");
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }

        for (int i = n-1; i >=1 ; i--) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }

    }
}
