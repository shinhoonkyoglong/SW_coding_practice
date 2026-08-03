import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int T = Integer.parseInt(N);
		for (int test_case = 1; test_case < T+1; test_case++) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = (a+b) / 2;
			int d = (a-b) / 2;
			System.out.println(c + " " + d);
		}
	}
}
