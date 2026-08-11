import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Solution
{	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); 
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			String b = st.nextToken();
			int at = 0;
			int gc = 0;
			Map<Map<Integer, Integer>, Integer> map = new HashMap<>();
			Map<Integer, Integer> de = new HashMap<>();
			de.put(0, 0);
			long count = 0;
			map.put(de, 1);
			
			for (char ch : b.toCharArray()) {
				if (ch == 'A') {
					at++;
				} else if (ch == 'T') {
					at--;
				} else if (ch == 'G') {
					gc++;
				} else {
					gc--;
				}
				Map<Integer, Integer> score = new HashMap<>();
				score.put(at, gc);
				int cur = map.getOrDefault(score, 0);
				count += cur;
				map.put(score, cur+1);
			}
			System.out.println(count);
		}
	}
}