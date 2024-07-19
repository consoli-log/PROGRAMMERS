package Level0.Day18;

import java.util.Arrays;

/*
    @ 문자열 정렬하기(2)

    영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
    my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.

    @ 제한사항
    - 0 < my_string 길이 < 100
    */
public class Day18_004 {

    public static void main(String[] args) {

        System.out.println(solution("Bcad")); // "abcd"
        System.out.println(solution("heLLo")); // "ehllo"
        System.out.println(solution("Python")); // "hnopty"

    }

    public static String solution(String my_string) {
        String answer = my_string.toLowerCase();

        String[] str = answer.split("");

        Arrays.sort(str);

        answer = String.join("", str);

        return answer;

        // char[] 이라면 new String을 통해 새로운 문자열로 반환할 수 있다.
        // char[]   배열을 문자열로 변환: new String(char[])
        // String[] 배열을 문자열로 변환: String.join("", String[])

        // return new String(str);
    }

}
