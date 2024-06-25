package Level0;

import java.util.Arrays;

    /*
    @ 최댓값 만들기(1)

    정수 배열 numbers가 매개변수로 주어집니다.
    numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 0 ≤ numbers의 원소 ≤ 10,000
    - 2 ≤ numbers의 길이 ≤ 100
    */
public class Day11_003 {

    public static void main(String[] args) {

        System.out.println(solution(new int[] {1, 2, 3, 4, 5})); // 20
        System.out.println(solution(new int[] {0, 31, 24, 10, 1, 9})); // 744

    }

    public static int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        return answer;
    }

}
