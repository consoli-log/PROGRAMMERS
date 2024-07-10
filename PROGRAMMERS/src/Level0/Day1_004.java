package Level0;

    /*
    @ 몫 구하기

    정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 0 < num1 ≤ 100
    - 0 < num2 ≤ 100
    */
public class Day1_004 {

    public static void main(String[] args) {

        System.out.println(solution(10, 5)); // 2
        System.out.println(solution(7, 2)); // 3

    }

    public static int solution(int a, int b) {
        int num1 = a;
        int num2 = b;

        int answer = num1 / num2;

        return answer;
    }

}
