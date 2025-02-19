public class Matrix {
    public Matrix() {
    }
    public static void main(String[] args) {
        int[][] var1 = new int[][]{{1, 2, 4}, {3, 5, 6}, {4, 8, 9}};
        int[][] var2 = new int[][]{{6, 8, 7}, {2, 5, 4}, {5, 2, 1}};
        int[][] var3 = new int[3][3];

        int var4;
        int var5;
        for(var4=0;var4<3;var4++) {
            for(var5=0;var5<3;var5++) {
               var3[var4][var5]=var1[var4][var5]+var2[var4][var5];
            }
         }
         System.out.println("Result of Matrix Addition:");

      for(var4=0;var4<3;var4++) {
         for(var5=0;var5<3;var5++) {
            System.out.print(var3[var4][var5]+" ");
         }

         System.out.println();
      }

   }
}
  