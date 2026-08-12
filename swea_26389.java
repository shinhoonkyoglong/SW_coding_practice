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
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			boolean ns = (s.contains("S")) == (s.contains("N"));
			boolean we = (s.contains("W")) == (s.contains("E"));
			if (ns && we) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}