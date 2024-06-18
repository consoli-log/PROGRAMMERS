package Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
    @ 가까운 수

    정수 배열 array와 정수 n이 매개변수로 주어질 때,
    array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - 1 ≤ array의 길이 ≤ 100
    - 1 ≤ array의 원소 ≤ 100
    - 1 ≤ n ≤ 100
    - 가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.
    */
public class Day14_001 {

    public static void main(String[] args) {

        System.out.println(solution(new int[] {3, 10, 28}, 20));
        System.out.println(solution(new int[] {10, 11, 12}, 13));
        System.out.println(solution(new int[] {2, 3, 4}, 1));


    }

    public static int solution(int[] array, int n) {
        int answer = 0;

        int[] newArray = Arrays.copyOf(array, array.length + 1);

        newArray[array.length] = n;

        Arrays.sort(newArray);

        int findIndex = Arrays.binarySearch(newArray, n);

        if (findIndex != newArray.length - 1  && findIndex != 0) { // n의 값이 제일 크거나 제일 작지 않을 때

            if (  newArray[findIndex] - newArray[findIndex - 1]
                <= newArray[findIndex + 1] - newArray[findIndex]) { // 다음 인덱스와의 차이가 이전 인덱스와의 차이보다 크다면 이전 인덱스의 값 RETURN
                answer = newArray[findIndex - 1];
            } else if ( newArray[findIndex] - newArray[findIndex - 1]
                    > newArray[findIndex + 1] - newArray[findIndex]) { // 다음 인덱스와의 차이가 이전 인덱스와의 차이보다 작다면 이전 인덱스의 값 RETURN
                answer = newArray[findIndex + 1];
            }

        }  else {
            if (findIndex == 0) { // n의 인덱스 값이 제일 작거나
                answer = newArray[findIndex + 1];
            } else { // n의 인덱스 값이 제일 크거나
                answer = newArray[findIndex - 1];
            }
        }


        return answer;
    }

}
