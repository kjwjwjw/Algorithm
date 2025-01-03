package chap2;

import java.util.*;
/*
5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.


N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.


입력

첫 줄에 자연수 N이 주어진다.(2<=N<=50)

5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19


두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.


출력

최대합을 출력합니다.
 */
class Main21 {

    public int soultion(int n, int [][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for(int i=0; i<n; i++) {
            sum1=sum2=0;
            for(int j=0; j<n; j++) {
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }

        sum1=sum2=0;
        for(int i=0;i<n; i++) {
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer, sum2);

        return answer;
    }

    public static void main(String args[]) {
        Main21 T = new Main21();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [][] arr = new int[n][n];

        for(int i=0; i<n;i++) {
           for(int j=0;j <n;j++) {
               arr[i][j] = kb.nextInt();
           }
        }



        System.out.print(T.soultion(n, arr));


    }
}
