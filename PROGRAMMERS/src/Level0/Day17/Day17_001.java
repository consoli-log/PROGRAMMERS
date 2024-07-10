package Level0.Day17;

    /*
    @ 숫자 찾기

    정수 num과 k가 매개변수로 주어질 때,
    num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
    없으면 -1을 return 하도록 solution 함수를 완성해보세요.

    @ 제한사항
    - 0 < num < 1,000,000
    - 0 ≤ k < 10
    - num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다.
    */
public class Day17_001 {

    public static void main(String[] args) {

        System.out.println(solution(29183, 1)); // 3
        System.out.println(solution(232443, 4)); // 4
        System.out.println(solution(123456, 7)); // -1

    }

    public static int solution(int num, int k) {
        int answer = 0;

        String[] numlist = Integer.toString(num).split("");

        for (int i = 0; i < numlist.length; i++) {

//            System.out.println("numlist[i] : " + numlist[i] + ", k : " + k);

            if (numlist[i].equals(Integer.toString(k))) {
                answer = i + 1;
                return answer;
            }

            answer = -1;

        }

        return answer;
    }

}
