package Level0;

import java.util.Arrays;

    /*
    @ 분수의 덧셈

    첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
    두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
    두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

    @ 제한사항
    - 0 <numer1, denom1, numer2, denom2 < 1,000
    */
public class Day2_003 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(1, 2, 3, 4))); // [5, 4]
        System.out.println(Arrays.toString(solution(9, 2, 1, 3))); // [29, 6]

    }

    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        denum1 *= num2;
        denum2 *= num1;

        int[] answer = new int[]{denum1 + denum2 , num1 * num2};
        int max = GCD(answer[0], answer[1]);

        answer[0] /= max;
        answer[1] /= max;

        return answer;
    }

    public static int GCD(int num1, int num2) {
        if(num1 % num2 == 0){
            return num2;
        }
        return GCD(num2, num1 % num2);
    }

}
