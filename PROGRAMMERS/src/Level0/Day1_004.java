package Level0;

// 몫 구하기
public class Day1_004 {

    public static void main(String[] args) {

        System.out.println(solution(10,5));
        System.out.println(solution(7,2));

    }

    public static int solution(int a, int b) {
        int num1 = a;
        int num2 = b;

        int answer = num1 / num2;

        return answer;
    }
}
