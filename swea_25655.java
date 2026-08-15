import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution
{	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); 
		for (int tc = 1; tc <= T; tc++) {
			int a = Integer.parseInt(br.readLine());
			if (a==0) {
				System.out.print(1);
			} else if(a==1){
				System.out.print(0);
			} else {
				int top = a / 2;
				int bot = a % 2;
				if (bot >= 1) {
					System.out.print(4);
					bot--;
				}
				for (int i = 0; i < top; i++) {
					System.out.print(8);
				}
			}
			System.out.println();
		}
	}
}