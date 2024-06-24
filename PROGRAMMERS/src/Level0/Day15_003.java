package Level0;

import java.util.*;
import java.util.stream.Collectors;

/*
    @ 한 번만 등장한 문자

    문자열 s가 매개변수로 주어집니다.
    s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
    한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

    @ 제한사항
    - 0 < s의 길이 < 1,000
    - s는 소문자로만 이루어져 있습니다.
    */
public class Day15_003 {

    public static void main(String[] args) {

        System.out.println(solution("abcabcadc"));
        System.out.println(solution("abdc"));
        System.out.println(solution("hello"));

    }

    public static String solution(String s) {
        String answer = "";

        String[] strArr = s.split("");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(strArr));

//        List<String> distinctList = list.stream().distinct().collect(Collectors.toList());

        // 요소의 갯수가 1개 이상인 경우를 리스트로 담아준다 (리스트의 경우 중복도 담기기 때문에 set 대신 리스트로 담기)
        List<String> distinctList = list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toList());

        // 중복이 들어간 리스트를 전부 돌면서 리스트를 지워준다
        for (String el : distinctList) {
            list.remove(el);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }

        return answer;
    }

}
