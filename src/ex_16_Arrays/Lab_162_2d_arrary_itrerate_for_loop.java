package ex_16_Arrays;

public class Lab_162_2d_arrary_itrerate_for_loop {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{6,7,8}};
      for(int i = 0; i< matrix.length; i++){
          for(int j=0; j<matrix[i].length; j++){
             // System.out.print(matrix[i][j]);
              System.out.print("*");
          }
          System.out.println();
      }
    }
}
