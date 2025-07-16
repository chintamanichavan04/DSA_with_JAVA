public class Pattern {
    // * * * * * 
    // * * * * * 
    // * * * * * 
    // * * * * * 
    // * * * * * 
    static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * 
    // * * 
    // * * * 
    // * * * * 
    // * * * * * 
    
    static void pattern2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * * * * * 
    // * * * * 
    // * * * 
    // * * 
    // * 
    static void pattern3(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//         *         
//       * * *       
//     * * * * *     
//   * * * * * * *   
// * * * * * * * * * 

    static void pattern4(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("* ");
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 5;
        // pattern1(n);
        // pattern2(n);
        pattern4(n);

    }
}