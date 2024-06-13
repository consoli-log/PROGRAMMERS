package Level0;

// 숫자 비교하기
public class Day2_002 {

    public static void main(String[] args) {

        System.out.println(solution(2, 3));
        System.out.println(solution(11, 11));
        System.out.println(solution(7, 99));

    }

    public static int solution(int a, int b) {
        int answer = 0;

        if(a == b) {
            answer = 1;
        } else if (a != b) {
            answer = -1;
        }

        return answer;
    }

}
