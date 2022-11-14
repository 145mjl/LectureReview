package maxMin;

import java.util.Scanner;

public class useBooleanArray {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] ar = new int[6];
      boolean[] chk = new boolean[6];
      for (int i = 0; i < ar.length; i++) {
         ar[i] = sc.nextInt();
      }
      sc.close();

      // 입력값 확인
      for (int i = 0; i < ar.length; i++) {
         System.out.print(ar[i] + " ");
      }
      System.out.println();

      for (int i = 0; i < ar.length; i++) {
         int max = Integer.MIN_VALUE;

         for (int j = 0; j < ar.length; j++) {
            if (max < ar[j] && chk[j] == false) {
               max = ar[j];
            }
         }

         for (int j = 0; j < ar.length; j++) {
            if (max == ar[j]) {
               chk[j] = true;
            }
         }

         for (int j = 0; j < ar.length; j++) {
            System.out.printf("%5d ", ar[j]);
         }
         System.out.println();
         for (int j = 0; j < ar.length; j++) {
            System.out.printf("%5b ", chk[j]);
//            System.out.print(chk[j] + " ");
         }
         System.out.print(" : MAX - " + max + "\n");
      }
   }
}