package Level0;

    /*
    @ 숫자 비교하기

    정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 0 ≤ num1 ≤ 10,000
    - 0 ≤ num2 ≤ 10,000
    */
public class Day2_002 {

    public static void main(String[] args) {

        System.out.println(solution(2, 3));
        System.out.println(solution(11, 11));
        System.out.println(solution(7, 99));

    }

    public static int solution(int a, int b) {
        int answer = 0;

        if(a == b) {
            answer = 1;
        } else if (a != b) {
            answer = -1;
        }

        return answer;
    }

}
