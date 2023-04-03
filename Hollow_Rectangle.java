public class Hollow_Rectangle {

    public static void Hollow_Rect_Pattern(int tot_rows, int tot_colm){
         for (int i=1; i<=tot_rows; i++){
            for(int j = 1; j<=tot_colm; j++){
                if(i == 1 || i == tot_rows || j == 1 || j == tot_colm){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }
    public static void main(String args[]){
       Hollow_Rect_Pattern(4, 5);
    }
}
