package Level0.Day1;

    /*
    @ 두 수의 합

    정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.

    @ 제한사항
    - -50,000 ≤ num1 ≤ 50,000
    - -50,000 ≤ num2 ≤ 50,000
    */
public class Day1_001 {

    public static void main(String[] args) {

        System.out.println(solution(2, 3)); // 5
        System.out.println(solution(100, 2)); // 102

    }

    public static int solution(int a, int b) {
        int num1 = a;
        int num2 = b;

        int answer = num1 + num2;

        return answer;
    }

}
