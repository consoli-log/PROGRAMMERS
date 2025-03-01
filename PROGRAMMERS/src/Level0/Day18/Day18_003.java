package Level0.Day18;

    /*
    @ 세균 증식

    어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
    처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 1 ≤ n ≤ 10
    - 1 ≤ t ≤ 15
    */
public class Day18_003 {

    public static void main(String[] args) {

        System.out.println(solution(2, 10)); // 2048
        System.out.println(solution(7, 15)); // 229376

    }

    public static int solution(int n, int t) {

        for (int i = 1; i <= t; i++){
            n = n * 2;
        }

        return n;
    }

}
