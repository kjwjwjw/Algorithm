import java.util.Scanner;

class Main2 {
    public String soultion(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2  T = new Main2();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.soultion(str));
    }
}