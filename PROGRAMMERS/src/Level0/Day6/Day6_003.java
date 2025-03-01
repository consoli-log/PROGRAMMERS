package Level0.Day6;

import java.util.Arrays;

    /*
    @ 짝수 홀수 개수

    정수가 담긴 리스트 num_list가 주어질 때,
    num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

    @ 제한사항
    - 1 ≤ num_list의 길이 ≤ 100
    - 0 ≤ num_list의 원소 ≤ 1,000
    */
public class Day6_003 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5}))); // [2, 3]
        System.out.println(Arrays.toString(solution(new int[] {1, 3, 5, 7}))); // [0, 4]

    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++){

            if (num_list[i] % 2 == 0) {
                answer[0] += 1;
            } else if(num_list[i] % 2 != 0) {
                answer[1] += 1;
            }

        }

        return answer;
    }

}
