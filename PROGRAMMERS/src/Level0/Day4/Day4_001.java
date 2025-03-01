package Level0.Day4;

    /*
    @ 피자 나눠 먹기 (1)

    머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
    피자를 나눠먹을 사람의 수 n이 주어질 때,
    모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.

    @ 제한사항
    - 1 ≤ n ≤ 100
    */
public class Day4_001 {

    public static void main(String[] args) {

        System.out.println(solution(7)); // 1
        System.out.println(solution(1)); // 1
        System.out.println(solution(15)); // 3

    }

    public static int solution(int n) {
        int answer = 0;

        int pizza = n / 7;
        int slice = n % 7;

        if (slice != 0) {
            answer = pizza + 1;
        } else
            answer = pizza;

        return answer;
    }

}
