package Level0;

// 삼각형의 완성조건(1)
public class Day13_004 {

    public static void main(String[] args) {

        System.out.println(solution(new int[] {1, 2, 3}));
        System.out.println(solution(new int[] {3, 6, 2}));
        System.out.println(solution(new int[] {199, 72, 222}));

    }

    public static int solution(int[] sides) {
        int answer = 0;

        int maxSides = sides[0];
        int sumsides = 0;

        for (int i = 1; i < sides.length; i++) {
            if (maxSides < sides[i] ) {
                sumsides += maxSides;
                maxSides = sides[i];
            } else {
                sumsides += sides[i];
            }
        }

        if (sumsides <= maxSides) {
            answer = 2;
        } else if (sumsides > maxSides) {
            answer = 1;
        }

        return answer;
    }

}
