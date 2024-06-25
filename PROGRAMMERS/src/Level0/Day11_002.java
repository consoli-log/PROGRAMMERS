package Level0;

    /*
    @ 합성수 찾기

    약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
    자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 1 ≤ n ≤ 100
    */
public class Day11_002 {

    public static void main(String[] args) {

        System.out.println(solution(10)); // 5
        System.out.println(solution(15)); // 8

    }

    public static int solution(int n) {
        int answer = 0;

        int composition = 0; // 합성수의 개수

        // 1. n 이하의 수를 하나하나 약수의 갯수를 구한다.
        // 2. 약수의 갯수가 3개 이상이면 count
        // 3. 최종 count 된 수를 return

        for (int f = 1; f <= n;  f++) {

            int factor = 0; // 약수의 개수

            for(int i = 1; i <= Math.sqrt(f); i++) {
                if(i * i == f)
                    factor++;
                else if(f % i == 0)
                    factor += 2;
            };

            if (factor >= 3) {
                composition++;
            }

            answer = composition;

        };

        return answer;
    }

}
