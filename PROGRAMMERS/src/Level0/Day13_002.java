package Level0;

import java.util.Arrays;

    /*
    @ 배열 원소의 길이

    문자열 배열 strlist가 매개변수로 주어집니다.
    strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 1 ≤ strlist 원소의 길이 ≤ 100
    - strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.
    */
public class Day13_002 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new String[] {"We", "are", "the", "world!"})));
        System.out.println(Arrays.toString(solution(new String[] {"I", "Love", "Programmers."})));

    }

    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }

}
