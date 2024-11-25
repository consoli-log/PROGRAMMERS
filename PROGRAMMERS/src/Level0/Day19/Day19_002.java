package Level0.Day19;

import java.util.Arrays;

    /*
    @ 잘라서 배열로 저장하기

    문자열 my_str과 n이 매개변수로 주어질 때,
    my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 1 ≤ my_str의 길이 ≤ 100
    - 1 ≤ n ≤ my_str의 길이
    - my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
    */
public class Day19_002 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6))); // ["abc1Ad", "dfggg4", "556b"]
        System.out.println(Arrays.toString(solution("abcdef123", 3))); // ["abc", "def", "123"]

    }

    public static String[] solution(String my_str, int n) {
        int str_len = 0;

        if (my_str.length() % n == 0) {
            str_len = my_str.length() / n;
        } else {
            str_len = my_str.length() / n + 1;
        }

        String[] answer = new String[str_len];

        for (int i = 0; i < str_len; i++) {
            answer[i] = my_str.substring(i * n, my_str.length() >= (i * n) + n ? (i * n) + n : my_str.length());
        }

        return answer;
    }

}
