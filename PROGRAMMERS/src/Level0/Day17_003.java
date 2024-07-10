package Level0;

    /*
    @ 자릿수 더하기

    정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

    @ 제한사항
    - 0 ≤ n ≤ 1,000,000
    */
public class Day17_003 {

    public static void main(String[] args) {

        System.out.println(solution(1234)); // 10
        System.out.println(solution(930211)); // 16

    }

    public static int solution(int n) {
        int answer = 0;

        String[] str = Integer.toString(n).split("");

        for(String text : str) {
            answer += Integer.parseInt(text);
        }

        return answer;
    }

}
