package Level0.Day3;

import java.util.Arrays;

    /*
    @ 최빈값 구하기

    최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
    정수 배열 array가 매개변수로 주어질 때,
    최빈값을 return 하도록 solution 함수를 완성해보세요.
    최빈값이 여러 개면 -1을 return 합니다.

    @ 제한사항
    - 0 < array의 길이 < 100
    - 0 ≤ array의 원소 < 1000
    */
public class Day3_003 {

    public static void main(String[] args) {

        System.out.println(solution(new int[] {1, 2, 3, 3, 3, 4})); // 3
        System.out.println(solution(new int[] {1, 1, 2, 2})); // -1
        System.out.println(solution(new int[] {1})); // 1

    }

    public static int solution(int[] array) {

        Arrays.sort(array);

        int answer = 0;
        int max = Integer.MIN_VALUE; // 상수를 사용한 초기화
        int[] index = new int[1001];

        // 배열의 요소별로 동일한 수를 카운트 할때 사용하는 방법 (카운트배열)
        for(int i = 0; i < array.length; i++) {
            index[array[i]]++;
        }

        for(int i = 0; i < index.length; i++) {
            if(index[i] > max) {
                max = index[i];
                answer = i;
            } else if (index[i] == max) {
                answer = -1;
            }
        }

        return answer;
    }

}
