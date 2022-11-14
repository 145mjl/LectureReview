package numBaseBall;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] ar = new int[3];

      for (int i = 0; i < ar.length; i++) {
         ar[i] = (int) (Math.random() * 10);
         for (int j = 0; j < i; j++) {
            if (ar[i] == ar[j]) {
               i--;
               break;
            }
         }
      }
      System.out.print(Arrays.toString(ar));
      while (true) {

         int stCount = 0;
         int ballCount = 0;

          // 정답 출력
         System.out.println("숫자 3개를 입력하세요:");
         for (int j = 0; j < ar.length; j++) {
            int inp = sc.nextInt();

            if (inp == ar[0] || inp == ar[1] || inp == ar[2]) {
               if (inp == ar[j]) {
                  stCount++;
                  continue;
               }
               ballCount++;
            }

         }
         if (ballCount == 0 && stCount == 0) {
            System.out.println("OUT");
         }
         if ((stCount >= 1 || ballCount >= 1) && stCount != 3) {
            System.out.printf("%d Strike %d Ball\n", stCount, ballCount);
         }
         if (stCount == 3) {
            System.out.print("정답입니다!");
            break;
         }

      }
      sc.close();

   }
}
//답안코드에서 배울 점 : 한 for문 내에서 입력값을 받으면서 동시에 중복 검사,스트라이크 카운트,볼 카운트를 하여 가독성이 좋고 깔끔함
