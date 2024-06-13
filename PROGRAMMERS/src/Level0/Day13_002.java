package Level0;

import java.util.Arrays;

// 배열 원소의 길이
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
