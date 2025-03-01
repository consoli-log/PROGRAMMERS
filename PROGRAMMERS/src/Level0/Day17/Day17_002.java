package Level0.Day17;

import java.util.ArrayList;
import java.util.Arrays;

    /*
    @ n의 배수 고르기

    정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
    numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 1 ≤ n ≤ 10,000
    - 1 ≤ numlist의 크기 ≤ 100
    - 1 ≤ numlist의 원소 ≤ 100,000
    */
public class Day17_002 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(3, new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12}))); // [6, 9, 12]
        System.out.println(Arrays.toString(solution(5, new int[] {1, 9, 3, 10, 13, 5}))); // [10, 5]
        System.out.println(Arrays.toString(solution(12, new int[] {2, 100, 120, 600, 12, 12}))); // [120, 600, 12, 12]

    }

    public static int[] solution(int n, int[] numlist) {

        ArrayList<Integer> list = new ArrayList<>();

        // 1. 주어진 변수와 배열의 각 요소를 나눠n 떨어지면 나두고 나머지가 있으면 제거
        // 2. 나눠 떨어지면 answer 배열에 담기 -> 가변크기를 위해 ArrayList 사용 ✔

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                list.add(numlist[i]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
