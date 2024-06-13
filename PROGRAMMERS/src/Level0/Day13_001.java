package Level0;

// 컨트롤 제트
public class Day13_001 {

    public static void main(String[] args) {

        System.out.println(solution("1 2 Z 3"));
        System.out.println(solution("10 20 30 40"));
        System.out.println(solution("10 Z 20 Z 1"));
        System.out.println(solution("10 Z 20 Z"));
        System.out.println(solution("-1 -2 -3 Z"));

    }

    public static int solution(String s) {
        int answer = 0;

        String[] split = s.split(" ");

        for (int i = 0; i < split.length; i++) {

            if (split[i].equals("Z")) {
                answer -= Integer.parseInt(split[i - 1]);
            } else {
                answer += Integer.parseInt(split[i]);
            }

        }

        return answer;
    }

}
