package chap2;

import java.util.*;
/*
설명

자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.


입력

첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.


출력

첫 줄에 소수의 개수를 출력합니다.
 */
class Main17 {
    public int soultion(int n) {
        int answer =0;
        int[] ch = new int[n+1];

        for(int i=2; i<n; i++) {
            if(ch[i] ==0) {
                answer++;
                for(int j=i; j <=n ; j=j+i) {
                    ch[j]=1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main17 T = new Main17();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.soultion(n));

    }
}
