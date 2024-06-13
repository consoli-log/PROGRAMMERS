package Level0;

import java.util.Arrays;

// 배열 두 배 만들기
public class Day2_004 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 100, -99, 1, 2, 3})));

    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];


        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }

}
