package chap2;

import java.util.*;
/*

 */
class Main13 {
    public ArrayList<Integer> soultion(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for(int i=1; i< n ; i++) {
            if(arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main13 T = new Main13();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.soultion(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
