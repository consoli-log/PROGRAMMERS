package Level0;

import java.util.Arrays;

    /*
    @ 진료순서 정하기

    외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
    정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 중복된 원소는 없습니다.
    - 1 ≤ emergency의 길이 ≤ 10
    - 1 ≤ emergency의 원소 ≤ 100
    */
public class Day8_003 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[] {3, 76, 24}))); // [3, 1, 2]
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5, 6, 7}))); // [7, 6, 5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(solution(new int[] {30, 10, 23, 6, 100}))); // [2, 4, 3, 5, 1]

    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        Integer[] tmpInts = Arrays.stream(emergency).boxed().toArray(Integer[]::new);

        Arrays.sort(tmpInts, (a, b) -> b - a); // 람다를 이용한 내림차순 정렬

        // 배열의 값을 찾아 해당 인덱스를 answer에 담기
        for (int i = 0; i < emergency.length; i++) {
            answer[i]  = Arrays.asList(tmpInts).indexOf(emergency[i]) + 1;
        }

        return answer;
    }

}
