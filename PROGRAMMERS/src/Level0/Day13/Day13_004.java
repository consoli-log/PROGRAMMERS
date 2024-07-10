package Level0.Day13;

    /*
    @ 삼각형의 완성조건 (1)

    선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
    - 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
    삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
    세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - sides의 원소는 자연수입니다.
    - sides의 길이는 3입니다.
    - 1 ≤ sides의 원소 ≤ 1,000
    */
public class Day13_004 {

    public static void main(String[] args) {

        System.out.println(solution(new int[] {1, 2, 3})); // 2
        System.out.println(solution(new int[] {3, 6, 2})); // 2
        System.out.println(solution(new int[] {199, 72, 222})); // 1

    }

    public static int solution(int[] sides) {
        int answer = 0;

        int maxSides = sides[0];
        int sumsides = 0;

        for (int i = 1; i < sides.length; i++) {
            if (maxSides < sides[i] ) {
                sumsides += maxSides;
                maxSides = sides[i];
            } else {
                sumsides += sides[i];
            }
        }

        if (sumsides <= maxSides) {
            answer = 2;
        } else if (sumsides > maxSides) {
            answer = 1;
        }

        return answer;
    }

}
