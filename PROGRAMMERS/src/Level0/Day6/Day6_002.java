package Level0.Day6;

import java.util.Scanner;

    /*
    @ 직각삼각형 출력하기

    "*"의 높이와 너비를 1이라고 했을 때,
    "*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
    정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.

    @ 제한사항
    - 1 ≤ n ≤ 10
    */
public class Day6_002 {

//    public static void main(String[] args) {
//
//        System.out.println(solution(3));
//        // *
//        // **
//        // ***
//
//    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

        }

}
