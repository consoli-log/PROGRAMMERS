package Level0;

import java.util.Arrays;

// 분수의 덧셈
public class Day2_003 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
        System.out.println(Arrays.toString(solution(9, 2, 1, 3)));

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
