package Level0.Day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

    /*
    @ 머쓱이보다 키 큰 사람

    머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
    머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
    머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.

    @ 제한사항
    - 1 ≤ array의 길이 ≤ 100
    - 1 ≤ height ≤ 200
    - 1 ≤ array의 원소 ≤ 200
    */
public class Day19_004 {

    public static void main(String[] args) {

        System.out.println(solution(new int[] {149, 180, 192, 170}, 167)); // 3
        System.out.println(solution(new int[] {180, 120, 140}, 190)); // 0
        System.out.println(solution(new int[] {189, 189}, 180)); // 2
        System.out.println(solution(new int[] {175, 175, 180}, 175)); // 1

    }

    public static int solution(int[] array, int height) {
        int answer = 0;

        // int[]를 Integer[]로 변환
        Integer[] integerArray = Arrays.stream(array).boxed().toArray(Integer[]::new);

        // Integer[]를 ArrayList<Integer>로 변환
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(integerArray));

        // 요소 추가
        arrayList.add(height);

        // 내림차순 정렬
        Collections.sort(arrayList, Collections.reverseOrder());

        answer = arrayList.indexOf(height);

        return answer;
    }

}
