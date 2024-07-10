package Level0.Day6;

    /*
    @ 문자열 뒤집기

    문자열 my_string이 매개변수로 주어집니다.
    my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 1 ≤ my_string의 길이 ≤ 1,000
    */
public class Day6_001 {

    public static void main(String[] args) {

        System.out.println(solution("jaron")); // "noraj"
        System.out.println(solution("bread")); // "daerb"

    }

    public static String solution(String my_string) {
        String answer = "";

        // for(int i = my_string.length() - 1; i >= 0 ; i-- ){
        //     answer = answer + my_string.charAt(i);
        // }

        StringBuffer sb = new StringBuffer(my_string);
        answer = sb.reverse().toString();

        return answer;
    }

}
