public class Star_pattern{
    public static void main(String args[]){
        int n=4;                                        // star pattern 
        for(int i=1; i<=n; i++){
            for(int j=1; j<= (n-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        int line=4;                                    // star inverted pattern
        for(int i=1; i<=line; i++){
            for(int j=1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}