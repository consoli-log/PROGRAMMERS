package Level0.Day21;

    /*
    @ 삼각형의 완성조건 (2)

    선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
    - 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
    삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
    나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - sides의 원소는 자연수입니다.
    - sides의 길이는 2입니다.
    - 1 ≤ sides의 원소 ≤ 1,000
    */
public class Day21_003 {

    public static void main(String[] args) {

        System.out.println(solution(new int[] {1, 2})); // 1
        System.out.println(solution(new int[] {3, 6})); // 5
        System.out.println(solution(new int[] {11, 7})); // 13

    }

    public static int solution(int[] sides) {
        int answer = 0;
        int MaxSides = 0;
        int MinSides = 0;

        // 1. sides로 입력된 두 요소 중 큰 수가 가장 긴 변일 때
        if (sides[0] > sides[1]) {
            MaxSides = sides[0];
            MinSides = sides[1];
        } else {
            MaxSides = sides[1];
            MinSides = sides[0];
        }

        for (int i = MaxSides - MinSides + 1; i <= MaxSides; i++) {
            answer++;
        }

        // 2. 입력되지 않은 나머지 한 변이 가장 긴 변일 때
        for (int i = MaxSides + 1; i < MaxSides + MinSides; i++) {
            answer++;
        }

        return answer;
    }

}
