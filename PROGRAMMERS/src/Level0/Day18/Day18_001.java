package Level0.Day18;

    /*
    @ 문자열안에 문자열

    문자열 str1, str2가 매개변수로 주어집니다.
    str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 1 ≤ str1의 길이 ≤ 100
    - 1 ≤ str2의 길이 ≤ 100
    - 문자열은 알파벳 대문자, 소문자, 숫자로 구성되어 있습니다.
    */
public class Day18_001 {

    public static void main(String[] args) {

        System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD")); // 1
        System.out.println(solution("ppprrrogrammers", "pppp")); // 2
        System.out.println(solution("AbcAbcA", "AAA")); // 2

    }

    public static int solution(String str1, String str2) {
        int answer = 0;

        answer = str1.contains(str2) ? 1 : 2;

//        String text = str1.replace(str2, " ");
//
//        if (text.contains(" ")) {
//            answer = 1;
//        } else {
//            answer = 2;
//        }

        return answer;
    }

}
