package Level0.Day17;

import java.util.Arrays;

/*
    @ OX퀴즈

    덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
    수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 연산 기호와 숫자 사이는 항상 하나의 공백이 존재합니다. 단 음수를 표시하는 마이너스 기호와 숫자 사이에는 공백이 존재하지 않습니다.
    - 1 ≤ quiz의 길이 ≤ 10
    - X, Y, Z는 각각 0부터 9까지 숫자로 이루어진 정수를 의미하며, 각 숫자의 맨 앞에 마이너스 기호가 하나 있을 수 있고 이는 음수를 의미합니다.
    - X, Y, Z는 0을 제외하고는 0으로 시작하지 않습니다.
    - -10,000 ≤ X, Y ≤ 10,000
    - -20,000 ≤ Z ≤ 20,000
    - [연산자]는 + 와 - 중 하나입니다.
    */
public class Day17_004 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new String[] {"3 - 4 = -3", "5 + 6 = 11"}))); // ["X", "O"]
        System.out.println(Arrays.toString(solution(new String[] {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"}))); // ["O", "O", "X", "O"]

    }

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {

            String[] calc = quiz[i].split(" ");

            int temp = calc[1].equals("+") ? Integer.parseInt(calc[0]) + Integer.parseInt(calc[2]) : Integer.parseInt(calc[0]) - Integer.parseInt(calc[2]);

            answer[i] = temp == Integer.parseInt(calc[4]) ? "O" : "X";

//            if (calc[1].equals("+")) {
//                temp = Integer.parseInt(calc[0]) + Integer.parseInt(calc[2]);
//            } else if (calc[1].equals("-")){
//                temp = Integer.parseInt(calc[0]) - Integer.parseInt(calc[2]);
//            }

//            if (temp == Integer.parseInt(calc[4])){
//                answer[i] = "O";
//            } else if (temp != Integer.parseInt(calc[4])){
//                answer[i] = "X";
//            }

        }

        return answer;
    }

}
