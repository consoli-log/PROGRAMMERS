package Level0;

    /*
    @ 대문자와 소문자

    문자열 my_string이 매개변수로 주어질 때,
    대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 1 ≤ my_string의 길이 ≤ 1,000
    - my_string은 영어 대문자와 소문자로만 구성되어 있습니다.
    */
public class Day14_004 {

    public static void main(String[] args) {

        System.out.println(solution("cccCCC"));
        System.out.println(solution("abCdEfghIJ"));

    }

    public static String solution(String my_string) {
        String answer = "";

        char[] charArr = my_string.toCharArray();

        for (int i = 0; i < charArr.length; i++ ){

            if(Character.isUpperCase(charArr[i])) {
                answer += Character.toLowerCase(charArr[i]);
            } else if(Character.isLowerCase(charArr[i])) {
                answer += Character.toUpperCase(charArr[i]);
            }

        }

        return answer;
    }





}
