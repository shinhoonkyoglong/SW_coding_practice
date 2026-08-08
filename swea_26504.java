import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringTokenizer;

class Solution
{	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int y = N*(N-1)/2;
			ArrayList<Integer> arr = new ArrayList<>();
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			for (int i = 0; i < y; i++) {
				int n = Integer.parseInt(st.nextToken());
				arr.add(n);
			}
			arr.sort(null);
			long ans1 = 0;
			for (int i = 0; i < N-1; i++) {
				ans1 += arr.get(i);
			}
			int i = 0;
			long ans2 = 0;
			for (int j = 1; j <= N-1; j++) {
				ans2 += arr.get(i);
				i += j;
			}
			System.out.println(ans1 + " " + ans2);
		}
	}
}