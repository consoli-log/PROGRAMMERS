package Level0.Day9;

    /*
    @ 가위 바위 보

    가위는 2 바위는 0 보는 5로 표현합니다.
    가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
    rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.

    @ 제한사항
    - 0 < rsp의 길이 ≤ 100
    - rsp와 길이가 같은 문자열을 return 합니다.
    - rsp는 숫자 0, 2, 5로 이루어져 있습니다.
    */
public class Day9_003 {

    public static void main(String[] args) {

        System.out.println(solution("2")); // "0"
        System.out.println(solution("205")); // "052"

    }

    public static String solution(String rsp) {
        String answer = "";

        String[] letter = rsp.split("");

        for(int i = 0; i < letter.length; i++){

            if (letter[i].equals("2")) {
                answer += "0";
            }

            if (letter[i].equals("0")) {
                answer += "5";
            }

            if (letter[i].equals("5")) {
                answer += "2";
            }

        }

        return answer;
    }

}
