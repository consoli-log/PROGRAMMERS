package Level0;

    /*
    @ 짝수의 합

    정수 n이 주어질 때,
    n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

    @ 제한사항
    - 0 < n ≤ 1000
    */
public class Day7_004 {

    public static void main(String[] args) {

        System.out.println(solution(10)); // 30
        System.out.println(solution(4)); // 6

    }

    public static int solution(int n) {
        int answer = 0;

        if (n % 2 == 0) {
            for (int i = n; i >= 0; i-=2) {
                answer += i;
            }
        } else if (n % 2 != 0) {
            for (int i = n-1; i >= 0; i-=2) {
                answer += i;
            }
        }

        return answer;
    }

}
