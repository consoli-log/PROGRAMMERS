package Level0;

    /*
    @ 나머지 구하기

    정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 0 < num1 ≤ 100
    - 0 < num2 ≤ 100
    */
public class Day3_001 {

    public static void main(String[] args) {

        System.out.println(solution(3, 2));
        System.out.println(solution(10, 5));

    }

    public static int solution(int a, int b) {
        int num1 = a;
        int num2 = b;

        int answer = num1 % num2 ;

        return answer;
    }

}
