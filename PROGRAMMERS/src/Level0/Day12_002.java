package Level0;

import java.util.Arrays;

    /*
    @ 문자열 정렬하기 (1)

    문자열 my_string이 매개변수로 주어질 때,
    my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.

    @ 제한사항
    - 1 ≤ my_string의 길이 ≤ 100
    - my_string에는 숫자가 한 개 이상 포함되어 있습니다.
    - my_string은 영어 소문자 또는 0부터 9까지의 숫자로 이루어져 있습니다.
    */
public class Day12_002 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution("hi12392"))); // [1, 2, 2, 3, 9]
        System.out.println(Arrays.toString(solution("p2o4i8gj2"))); // [2, 2, 4, 8]
        System.out.println(Arrays.toString(solution("abcde0"))); // [0]

    }

    public static int[] solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", "");

        int[] answer = new int[my_string.length()];

        for(int i = 0; i < my_string.length(); i++){

            // answer[i] = Character.getNumericValue(my_string.charAt(i));

            answer[i] = my_string.charAt(i) - '0';
        }

        Arrays.sort(answer);

        return answer;
    }

}
