import java.io.*;
import java.util.StringTokenizer;
// 25년 간의 수행 끝에 원재는 미래를 보는 능력을 갖게 되었다. 이 능력으로 원재는 사재기를 하려고 한다.

// 다만 당국의 감시가 심해 한 번에 많은 양을 사재기 할 수 없다.

// 다음과 같은 조건 하에서 사재기를 하여 최대한의 이득을 얻도록 도와주자.

//     1. 원재는 연속된 N일 동안의 물건의 매매가를 예측하여 알고 있다.
//     2. 당국의 감시망에 걸리지 않기 위해 하루에 최대 1만큼 구입할 수 있다.
//     3. 판매는 얼마든지 할 수 있다.

// 예를 들어 3일 동안의 매매가가 1, 2, 3 이라면 처음 두 날에 원료를 구매하여 마지막 날에 팔면 3의 이익을 얻을 수 있다.


// [입력]

// 첫 번째 줄에 테스트 케이스의 수 T가 주어진다.

// 각 테스트 케이스 별로 첫 줄에는 자연수 N(2 ≤ N ≤ 1,000,000)이 주어지고,

// 둘째 줄에는 각 날의 매매가를 나타내는 N개의 자연수들이 공백으로 구분되어 순서대로 주어진다.

// 각 날의 매매가는 10,000이하이다.


// [출력]

// 각 테스트 케이스마다 ‘#x’(x는 테스트케이스 번호를 의미하며 1부터 시작한다)를 출력하고, 최대 이익을 출력한다.


// [예제 풀이]

// 1번째 케이스는 아무 것도 사지 않는 것이 최대 이익이다.

// 2번째 케이스는 1,2일에 각각 한 개씩 사서 세 번째 날에 두 개를 팔면 10의 이익을 얻을 수 있다.
public class App {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader와 출력을 위한 BufferedWriter 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스의 개수를 입력받음
        int testCase = Integer.parseInt(br.readLine());

        // 각 테스트 케이스에 대한 반복
        for (int t = 1; t <= testCase; t++) {
            // 배열의 크기를 입력받음
            int n = Integer.parseInt(br.readLine());
            
            // 배열의 요소들을 문자열로 입력받고 StringTokenizer를 이용하여 정수 배열로 변환
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int[] list = new int[n];

            // 정수 배열로 변환한 값을 배열에 저장
            for (int i = 0; i < n; i++) {
                list[i] = Integer.parseInt(st.nextToken());
            }

            // 각 위치에서 최대값과의 차이를 저장할 배열 및 초기값 설정
            int max = 0;
            int[] sum = new int[n];

            // 배열을 역순으로 순회하면서 최대값 갱신과 차이를 계산하여 저장
            for (int j = n - 1; j >= 0; j--) {
                if (max < list[j]) max = list[j];
                sum[j] = max - list[j];
            }

            // 결과값 계산
            long res = 0;
            for (int i = 0; i < n; i++)
                res += sum[i];

            // 결과 출력
            bw.write("#" + t + " " + res + "\n");
        }

        // 출력 버퍼 비우고 닫기
        bw.flush();
        bw.close();
    }
}
