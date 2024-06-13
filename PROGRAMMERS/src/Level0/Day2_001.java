package Level0;

// 두 수의 나눗셈
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
