package Level0;

    /*
    @ 외계행성의 나이

    우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
    입국심사에서 나이를 말해야 하는데,
    PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
    a는 0, b는 1, c는 2, ..., j는 9입니다.
    예를 들어 23살은 cd, 51살은 fb로 표현합니다.
    나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.

    @ 제한사항
    - age는 자연수입니다.
    - age ≤ 1,000
    - PROGRAMMERS-962 행성은 알파벳 소문자만 사용합니다.
    */
public class Day8_002 {

    public static void main(String[] args) {

        System.out.println(solution(23)); // "cd"
        System.out.println(solution(51)); // "fb"
        System.out.println(solution(100)); // "baa"

    }

    public static String solution(int age) {
        String answer = "";
        int cnt = 0;
        String letter = "";
        int result = 0;

        if (age < 10) {
            cnt = 1;
        } else if (age >= 10 && age < 100) {
            cnt = 2;
        } else if (age >= 100 && age < 1000)  {
            cnt = 3;
        } else if (age >= 1000){
            cnt = 4;
        }

        // 1의 자리 : n % 10
        // 10의 자리 : n % 100 / 10
        // 100의 자리 : n % 1000 / 100
        // 1000의 자리 : n % 10000 / 1000

        for (int i = cnt; i >= 1; i--) {

            if (i == 1) {
                result = age % 10;
            } else if (i == 2) {
                result = age % 100 / 10;
            } else if (i == 3) {
                result = age % 1000 / 100;
            } else if (i == 4) {
                result = age % 10000 / 1000;
            }

            if (result == 0){
                letter += "a";
            }

            if (result == 1){
                letter += "b";
            }

            if (result == 2){
                letter += "c";
            }

            if (result == 3){
                letter += "d";
            }

            if (result == 4){
                letter += "e";
            }

            if (result == 5){
                letter += "f";
            }

            if (result == 6){
                letter += "g";
            }

            if (result == 7){
                letter += "h";
            }

            if (result == 8){
                letter += "i";
            }

            if (result == 9){
                letter += "j";
            }

            answer = letter;
        }

        return answer;
    }

}
