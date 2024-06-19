package Level0;

    /*
    @ 배열의 평균값

    정수 배열 numbers가 매개변수로 주어집니다.
    numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 0 ≤ numbers의 원소 ≤ 1,000
    - 1 ≤ numbers의 길이 ≤ 100
    - 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
    */
public class Day4_004 {

    public static void main(String[] args) {

        System.out.println(solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(solution(new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));

    }

    public static double solution(int[] numbers) {
        double answer = 0;
        int num = 0;

        for(int i = 0; i < numbers.length; i++) {
            num += numbers[i];
        }

        answer = (double)num / numbers.length;

        return answer;
    }

}