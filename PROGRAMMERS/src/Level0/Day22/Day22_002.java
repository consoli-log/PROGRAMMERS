package Level0.Day22;

    /*
    @ 평행

    점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
    - [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
    주어진 네 개의 점을 두 개씩 이었을 때,
    두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.

    @ 제한사항
    - dots의 길이 = 4
    - dots의 원소는 [x, y] 형태이며 x, y는 정수입니다.
        - 0 ≤ x, y ≤ 100
    - 서로 다른 두개 이상의 점이 겹치는 경우는 없습니다.
    - 두 직선이 겹치는 경우(일치하는 경우)에도 1을 return 해주세요.
    - 임의의 두 점을 이은 직선이 x축 또는 y축과 평행한 경우는 주어지지 않습니다.
    */
public class Day22_002 {

    public static void main(String[] args) {

        System.out.println(solution(new int[][] {{1, 4}, {9, 2}, {3, 8}, {11, 6}})); // 1
        System.out.println(solution(new int[][] {{3, 5}, {4, 1}, {2, 4}, {5, 10}})); // 0
        System.out.println(solution(new int[][] {{1, 2}, {5, 1}, {3, 6}, {6, 3}})); // 1
        System.out.println(solution(new int[][] {{3, 5}, {4, 4}, {8, 9}, {6, 11}})); // 1
        System.out.println(solution(new int[][] {{1, 2}, {2, 1}, {3, 4}, {4, 5}})); // 0
        System.out.println(solution(new int[][] {{1, 1}, {2, 2}, {3, 3}, {4, 4}})); // 1

    }

    public static int solution(int[][] dots) {
        int answer = 0;

        int ax = dots[0][0];
        int ay = dots[0][1];
        int bx = dots[1][0];
        int by = dots[1][1];
        int cx = dots[2][0];
        int cy = dots[2][1];
        int dx = dots[3][0];
        int dy = dots[3][1];

        if ( (by - ay) / (bx - ax) == (dy - cy) / (dx - cx) ||
             (cy - ay) / (cx - ax) == (dy - by) / (dx - bx) ||
             (dy - ay) / (dx - ax) == (cy - by) / (cx - bx) ) {
            answer = 1;
        }

        return answer;

    }


}
