package Level0.Day5;

    /*
    @ 나이 출력

    머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
    2022년 기준 선생님의 나이 age가 주어질 때,
    선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요

    @ 제한사항
    - 0 < age ≤ 120
    - 나이는 태어난 연도에 1살이며 매년 1월 1일마다 1살씩 증가합니다.
    */
public class Day5_003 {

    public static void main(String[] args) {

        System.out.println(solution(40)); // 1983
        System.out.println(solution(23)); // 2000

    }

    public static int solution(int age) {
        int answer = 0;
        int year = 2022;

        answer = year - age + 1;

        return answer;
    }

}
