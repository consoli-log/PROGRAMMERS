package Level0.Day18;

    /*
    @ 제곱수 판별하기

    어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
    정수 n이 매개변수로 주어질 때,
    n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 1 ≤ n ≤ 1,000,000
    */
public class Day18_002 {

    public static void main(String[] args) {

        System.out.println(solution(144)); // 1
        System.out.println(solution(976)); // 2

    }

    public static int solution(int n) {
        int answer = 2;

        if (Math.sqrt(n) == (int)Math.sqrt(n)) { // 루트값이 정수와 같으면
            answer = 1;
        }

        return answer;
    }

}
