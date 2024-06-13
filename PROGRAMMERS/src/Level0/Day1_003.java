package Level0;

// 두 수의 곱
public class Day1_003 {

    public static void main(String[] args) {

        System.out.println(solution(3, 4));
        System.out.println(solution(27, 19));

    }

    public static int solution(int a, int b) {
        int num1 = a;
        int num2 = b;

        int answer = num1 * num2;

        return answer;
    }
}
