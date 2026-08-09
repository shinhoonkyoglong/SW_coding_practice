import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
		for (int test_case = 1; test_case <= T; test_case++) {
			System.out.print("#" + test_case + " ");
			int N = Integer.parseInt(br.readLine());
			String[] arr = new String[N+1];
			int[] left = new int[N+1];
			int[] right = new int[N+1];
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int y = Integer.parseInt(st.nextToken());
				arr[y] = st.nextToken();
				if (st.hasMoreTokens()) {
					left[y] = Integer.parseInt(st.nextToken());
				}
				if (st.hasMoreTokens()) {
					right[y] = Integer.parseInt(st.nextToken());
				}
			}
			for (int i = N; i >= 1; i--) {
				if (left[i] != 0 && right[i] != 0) {
					if (arr[i].equals("-")) {
						arr[i] = (Double.parseDouble((arr[left[i]])) - Double.parseDouble((arr[right[i]]))) + "";
					} else if (arr[i].equals("+")) {
						arr[i] = (Double.parseDouble((arr[left[i]])) + Double.parseDouble((arr[right[i]]))) + "";
					} else if (arr[i].equals("*")) {
						arr[i] = (Double.parseDouble((arr[left[i]])) * Double.parseDouble((arr[right[i]]))) + "";
					} else if (arr[i].equals("/")) {
						arr[i] = (Double.parseDouble((arr[left[i]])) / Double.parseDouble((arr[right[i]]))) + "";
					}
					
				}
			}
			System.out.println((int) Double.parseDouble(arr[1]));
		}
	}
}