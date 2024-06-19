package Level0;

    /*
    @ 두 수의 나눗셈

    정수 num1과 num2가 매개변수로 주어질 때,
    num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.

    @ 제한사항
    - 0 < num1 ≤ 100
    - 0 < num2 ≤ 100
    */
public class Day2_001 {

    public static void main(String[] args) {

        System.out.println(solution(3, 2));
        System.out.println(solution(7, 3));
        System.out.println(solution(1, 16));

    }

    public static int solution(int a, int b) {
        double num1 = (double)a;
        double num2 = (double)b;

        double answer = num1 / num2 * 1000.0;

        return (int)answer;
    }

}
