package Level0;

    /*
    @ 두 수의 차

    정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.

    @ 제한사항
    - -50,000 ≤ num1 ≤ 50,000
    - -50,000 ≤ num2 ≤ 50,000
    */
public class Day1_002 {

    public static void main(String[] args) {

        System.out.println(solution(2, 3)); // -1
        System.out.println(solution(100, 2)); // 98

    }

    public static int solution(int a, int b) {
        int num1 = a;
        int num2 = b;

        int answer = num1 - num2;

        return answer;
    }

}
