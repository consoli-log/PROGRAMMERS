package Level0;

    /*
    @ 두 수의 곱

    정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 0 ≤ num1 ≤ 100
    - 0 ≤ num2 ≤ 100
    */
public class Day1_003 {

    public static void main(String[] args) {

        System.out.println(solution(3, 4)); // 12
        System.out.println(solution(27, 19)); // 513

    }

    public static int solution(int a, int b) {
        int num1 = a;
        int num2 = b;

        int answer = num1 * num2;

        return answer;
    }

}
