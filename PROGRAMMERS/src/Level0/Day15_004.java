package Level0;

import java.util.ArrayList;
import java.util.Arrays;

/*
    @ 약수 구하기

    정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 1 ≤ n ≤ 10,000
    */
public class Day15_004 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(24))); // [1, 2, 3, 4, 6, 8, 12, 24]
        System.out.println(Arrays.toString(solution(29))); // [1, 29]

    }

    public static int[] solution(int n) {
        int[] answer = {};

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i < n / i) {
                arrayList.add(i);
                arrayList.add(n / i);
            } else if (n % i == 0 && i == n / i) {
                arrayList.add(i);
            }
        }

        answer = arrayList.stream()
//                .mapToInt(i -> i)
                .mapToInt(Integer::intValue)
                .toArray();

        Arrays.sort(answer);

        return answer;
    }

}
