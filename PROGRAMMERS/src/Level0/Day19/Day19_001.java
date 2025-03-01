package Level0.Day19;

    /*
    @ 7의 개수

    머쓱이는 행운의 숫자 7을 가장 좋아합니다.
    정수 배열 array가 매개변수로 주어질 때,
    7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

    @ 제한사항
    - 1 ≤ array의 길이 ≤ 100
    - 0 ≤ array의 원소 ≤ 100,000
    */
public class Day19_001 {

    public static void main(String[] args) {

        System.out.println(solution(new int[] {7, 77, 17})); // 4
        System.out.println(solution(new int[] {10, 29})); // 0

    }

    public static int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            // array[i] + ""를 하면 간단하게 숫자를 문자열로 변환 가능
            for (int j = 0; j < (array[i] + "").length(); j++) {
                if((array[i] + "").charAt(j) == '7') {
                    answer++;
                }
            }
        }

        return answer;
    }

}
