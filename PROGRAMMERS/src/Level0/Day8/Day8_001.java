package Level0.Day8;

import java.util.Arrays;

    /*
    @ 배열 자르기

    정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
    numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.

    @ 제한사항
    - 2 ≤ numbers의 길이 ≤ 30
    - 0 ≤ numbers의 원소 ≤ 1,000
    - 0 ≤num1 < num2 < numbers의 길이
    */
public class Day8_001 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5}, 1, 3))); // [2, 3, 4]
        System.out.println(Arrays.toString(solution(new int[] {1, 3, 5}, 1, 2))); // [3, 5]

    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);

        return answer;
    }

}
