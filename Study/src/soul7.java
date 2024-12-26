import java.util.*;
/*
회문 문자열
설명

앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.

문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 대소문자를 구분하지 않습니다.


입력

첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.


출력


 */
class Main7 {
    public String soultion(String str) {
        String answer="";

        str = str.toUpperCase();
        if(str.charAt(0) == str.charAt(str.length()-1)) {
            answer += "YES";
        } else {
            answer += "NO";
        }


        return answer;
    }

    public static void main(String[] args) {
        Main7 T = new Main7();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.soultion(str));
    }
}
