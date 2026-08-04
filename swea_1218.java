import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

class Solution
{	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 1; i <= 10; i++) {
			int ans = 1;
			int N = Integer.parseInt(br.readLine());
			Deque<Character> stack = new ArrayDeque<>();
			char[] arr = br.readLine().toCharArray();
			for (char c : arr) {
				if (c == '{' || c == '[' || c == '<' || c == '(') {
					stack.push(c);
				} else {
					if (stack.isEmpty()) {
						ans = 0;
						break;
					} else {
						if (c == '}' && stack.peek() == '{') {
							stack.pop();
						}
						else if (c == '>' && stack.peek() == '<') {
							stack.pop();
						}
						else if (c == ']' && stack.peek() == '[') {
							stack.pop();
						} 
						else if (c == ')' && stack.peek() == '(') {
							stack.pop();
						} else {
							ans = 0;
							break;
						}
					}
				}
				
				}
			if (!stack.isEmpty()) {
				ans = 0;
			}
			System.out.println("#" + i + " " + ans);
		}
	}
}