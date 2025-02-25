package Level0.Day23;

import java.util.Arrays;
import java.util.Comparator;

    /*
    @ 특이한 정렬

    정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
    이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
    정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 1 ≤ n ≤ 10,000
    - 1 ≤ numlist의 원소 ≤ 10,000
    - 1 ≤ numlist의 길이 ≤ 100
    - numlist는 중복된 원소를 갖지 않습니다.
    */
public class Day23_001 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5, 6}, 4))); // [4, 5, 3, 6, 2, 1]
        System.out.println(Arrays.toString(solution(new int[] {10000,20,36,47,40,6,10,7000}, 30))); // [36, 40, 20, 47, 10, 6, 7000, 10000]

    }

    public static int[] solution(int[] numlist, int n) {

        int[][] numGapList = new int[numlist.length][2];
        int[] answer = new int[numlist.length];
        int numGap;

        // 1. numlist[0]부터 반복문을 돌려서 n과의 차를 찾는다.
        for (int i = 0; i < numlist.length; i++) {
            numGap =  Math.abs(numlist[i] - n); // 숫자간 차의 절대값

            // 2. [0]부터 이중 배열에 [i][0]엔 [0]의 값, [i][1]엔 차를 저장
            numGapList[i][0] = numlist[i];
            numGapList[i][1] = numGap;
        }

//        for (int i = 0; i < numGapList.length; i++) {
//            System.out.println(Arrays.toString(numGapList[i]));
//        }

        // 3. [0]을 기준으로 내림차순 정렬, [1]의 기준으로 오름차순 정렬
        Arrays.sort(numGapList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]!=o2[1] ? o1[1]-o2[1] : o2[0]-o1[0]; // 첫번째 기준 내림차순 , 두번째 기준 오름차순
            }
        });

//        for (int i = 0; i < numGapList.length; i++) {
//            System.out.println("numGapList[" + i + "] : " + Arrays.toString(numGapList[i]));
//        }

        // 5. 수정이 끝나면 [i]의 값을 배열에 담아 return
        for (int i = 0; i < numGapList.length; i++) {
            answer[i] = numGapList[i][0];
        }

        return answer;
    }

}
