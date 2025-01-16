package chap3;

import java.util.*;

/*
설명

오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.


입력

첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.

두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.

네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.

각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.


출력


 */
class Main25 {

   public ArrayList<Integer> solution(int n, int m, int[] arr, int[] brr) {
       ArrayList<Integer> answer = new ArrayList<>();
       int p1=0, p2=0;
       while(p1<n && p2<m) {
           if(arr[p1]<brr[p2]) answer.add(arr[p1++]);
           else answer.add(brr[p2++]);
       }
       while(p1<n) answer.add(arr[p1++]);
       while(p2<m) answer.add(brr[p2++]);

       return answer;
   }


   public static void main(String args[]) {
       Main25 T = new Main25();
       Scanner kb = new Scanner(System.in);

       int n=kb.nextInt();
       int[] arr = new int[n];
       for(int i=0; i<n; i++) {
           arr[i] = kb.nextInt();
       }

       int m=kb.nextInt();
       int[] brr = new int[m];

       for(int i=0; i<m; i++) {
           brr[i] = kb.nextInt();
       }


       for(int x: T.solution(n,m,arr,brr)) System.out.print(x+ " ");

   }
}
