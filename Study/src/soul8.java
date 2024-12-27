import java.util.*;
/*
설명

앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.

문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.

알파벳 이외의 문자들의 무시합니다.


입력

첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.


출력


 */
class Main8 {
    public String soultion(String s) {
        String answer="NO";

        s=s.toUpperCase().replaceAll("[^A-Z]","");

        String tmp= new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) {
            answer="YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main8 T = new Main8();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.soultion(str));
    }
}
