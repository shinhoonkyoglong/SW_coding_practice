import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution
{	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); 
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int [][] arr = new int[N][2];
			long ans = Integer.MAX_VALUE;
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()); 
				int b = Integer.parseInt(st.nextToken());
				arr[i][0] = a;
				arr[i][1] = b;
				}
			Arrays.sort(arr, (a,b)-> Integer.compare(a[1], b[1]));
			for (int i = N-1; i >= 0; i--) {
				long a = arr[i][0];
				long b = arr[i][1];
				if (ans <= b ) {
					ans -= a;
				} else {
					ans = b - a;
				}
			}
			System.out.println(ans);
			}
	}
}