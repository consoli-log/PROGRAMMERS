package Level0.Day16;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
    @ 가장 큰 수 찾기

    정수 배열 array가 매개변수로 주어질 때,
    가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

    @ 제한사항
    - 1 ≤ array의 길이 ≤ 100
    - 0 ≤ array 원소 ≤ 1,000
    - array에 중복된 숫자는 없습니다.
    */
public class Day16_002 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[] {1, 8, 3}))); // [8, 1]
        System.out.println(Arrays.toString(solution(new int[] {9, 10, 11, 8}))); // [11, 2]

    }

    public static int[] solution(int[] array) {
        int[] answer = new int[2];

        int[] copy = Arrays.copyOf(array, array.length);

        Arrays.sort(copy);

        answer[0] = copy[copy.length - 1];
        answer[1] = Arrays.stream(array).boxed().collect(Collectors.toList()).indexOf(answer[0]);

        /*
            answer[1] = Arrays.asList(array).indexOf(answer[0]); 가 -1을 반환하는 이유
            Arrays.asList(array)는 제네릭 메서드로 배열을 기본형 배열이 아닌 참조형 배열을 인수로 받아야한다.
            따라서 아래와 같이 수정하면 사용가능하다.

            Integer[] integerArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
            answer[1] = Arrays.asList(integerArray).indexOf(answer[0]);
        */

        return answer;
    }

}
