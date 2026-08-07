import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Solution
{	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			String N = br.readLine();
			char[][] arr = new char[100][100] ;
			for (int i = 0; i < 100 ; i++) {
				arr[i] = br.readLine().toCharArray();
			}
			
			int[] dx = {0, 1, 0, -1};
			int[] dy = {1, 0, -1, 0};
			Deque<int[]> dq = new ArrayDeque<>();
			dq.add(new int[] {1,1});
			int ans = 0;
	
			while (!dq.isEmpty()) {
				int[] cur = dq.pop();
				if(arr[cur[0]][cur[1]]=='3') {
					ans = 1;
					break;
				}
				arr[cur[0]][cur[1]] = '1';
				for (int i = 0; i < 4; i++) {
					int x = cur[0] + dx[i];
					int y = cur[1] + dy[i];
					if (x >= 0 && x < 100 && y >= 0 && y < 100 && arr[x][y]!='1') {
						dq.add(new int[] {x, y});
					}
				}
			}
			System.out.println("#" + test_case + " " + ans);
		}
	}
}
