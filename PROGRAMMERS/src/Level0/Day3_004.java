package Level0;

import java.util.Arrays;

    /*
    @ 짝수는 싫어요

    정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 1 ≤ n ≤ 100
    */
public class Day3_004 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(10))); // [1, 3, 5, 7, 9]
        System.out.println(Arrays.toString(solution(15))); // [1, 3, 5, 7, 9, 11, 13, 15]

    }

    public static int[] solution(int n) {
        int length = 0;

        if (n % 2 != 0) {
            length = (n / 2) + 1;
        } else {
            length = (n / 2);
        }

        int[] answer = new int[length];

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer[i / 2] = i;
            }
        }

        return answer;
    }

}
