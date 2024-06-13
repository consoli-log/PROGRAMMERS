package Level0;

// 두 수의 차
public class Day1_002 {

    public static void main(String[] args) {

        System.out.println(solution(2, 3));
        System.out.println(solution(100, 2));

    }

    public static int solution(int a, int b) {
        int num1 = a;
        int num2 = b;

        int answer = num1 - num2;

        return answer;
    }

}
