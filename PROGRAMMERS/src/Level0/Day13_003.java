package Level0;

import java.util.Arrays;

// 중복된 문자 제거
public class Day13_003 {

    public static void main(String[] args) {

        System.out.println(solution("people"));
        System.out.println(solution("We are the world"));

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
