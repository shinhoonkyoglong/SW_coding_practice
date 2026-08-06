
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringTokenizer;

class Solution
{	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(s.nextToken());
			int N = Integer.parseInt(s.nextToken());
			int[] way1 = new int[100];
			int[] way2 = new int[100];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				int k = Integer.parseInt(st.nextToken());
				int p = Integer.parseInt(st.nextToken());
				if (way1[k] == 0) {
					way1[k] = p;
				} else {
					way2[k] = p;
				}
			}
			Deque<Integer> dq = new ArrayDeque<>();
			if (way1[0] != 0) {
				dq.add(way1[0]);
				way1[0] = 0;
			}
			if (way2[0] != 0) {
				dq.add(way2[0]);
				way2[0] = 0;
			}
			int ans = 0;
			while(!dq.isEmpty()) {
				int y = dq.pop();
				if(y==99) {
					ans = 1;
					break;
				}
				if (way1[y] != 0) {
					dq.add(way1[y]);
					way1[y] = 0;
				}
				if (way2[y] != 0) {
					dq.add(way2[y]);
					way2[y] = 0;
				}
			}
			System.out.println("#" + test_case + " " + ans);
		}
	}
}
