package Level0.Day9;

import java.math.BigInteger;

    /*
    @ 구슬을 나누는 경우의 수

    머쓱이는 구슬을 친구들에게 나누어주려고 합니다.
    구슬은 모두 다르게 생겼습니다.
    머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
    balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.

    @ 제한사항
    - 1 ≤ balls ≤ 30
    - 1 ≤ share ≤ 30
    - 구슬을 고르는 순서는 고려하지 않습니다.
    - share ≤ balls
    */
public class Day9_004 {

    public static void main(String[] args) {

        System.out.println(solution(3, 2)); // 3
        System.out.println(solution(5, 3)); // 10

    }

    public static int solution(int balls, int share) {
        return combination(balls, share);
    }

    public static int combination(int balls, int share){
        if(balls == share || share == 0) return 1;
        return combination((balls -1), (share -1)) + combination(balls - 1, share);
    }

//         BigInteger answer = 0;
//         BigInteger n = 1;
//         BigInteger m = 1;
//         BigInteger nm = 1;
//
//         for (BigInteger i = 1 ; i <= (BigInteger)balls; i++) {
//             // System.out.println("i : " + i);
//             n *= i;
//             // System.out.println("n : " + n);
//         }
//
//         for (BigInteger j = 1; j <= (BigInteger)share; j++) {
//             m *= j;
//         }
//
//         for (BigInteger k = 1; k <= (BigInteger)(balls-share); k++) {
//             nm *= k;
//         }
//
//
//         System.out.println("nm : " + nm + ", m : " + m + ", n : " + n);
//
//         answer = (n / (nm * m)) ;
//
//         return answer;
//    }

}
