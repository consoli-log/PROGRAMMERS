package Level0;

import java.util.Arrays;

    /*
    @ 중복된 문자 제거

    문자열 my_string이 매개변수로 주어집니다.
    my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 1 ≤ my_string ≤ 110
    - my_string은 대문자, 소문자, 공백으로 구성되어 있습니다.
    - 대문자와 소문자를 구분합니다.
    - 공백(" ")도 하나의 문자로 구분합니다.
    - 중복된 문자 중 가장 앞에 있는 문자를 남깁니다.
    */
public class Day13_003 {

    public static void main(String[] args) {

        System.out.println(solution("people")); // "peol"
        System.out.println(solution("We are the world")); // "We arthwold"

    }

    public static String solution(String my_string) {
        String answer = "";

        String[] str    = new String[my_string.length()];

        for(int i = 0; i < str.length; i++){
            str[i] = my_string.substring(i, i + 1);
        }

        String[] distinct = Arrays.stream(str).distinct().toArray(String[] :: new);

        for(int i = 0; i < distinct.length; i++){
            answer += distinct[i];
        }

        return answer;
    }

}
