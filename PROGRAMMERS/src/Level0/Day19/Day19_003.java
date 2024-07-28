package Level0.Day19;

    /*
    @ 중복된 숫자 개수

    정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
    array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

    @ 제한사항
    - 1 ≤ array의 길이 ≤ 100
    - 0 ≤ array의 원소 ≤ 1,000
    - 0 ≤ n ≤ 1,000
    */
public class Day19_003 {

    public static void main(String[] args) {

        System.out.println(solution(new int[] {1, 1, 2, 3, 4, 5}, 1)); // 2
        System.out.println(solution(new int[] {0, 2, 3, 4}, 1)); // 0

    }

    public static int solution(int[] array, int n) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                answer++;
            }
        }

        return answer;
    }

}
