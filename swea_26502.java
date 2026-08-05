import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Solution
{	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][2];
			
			// X좌표별 Y의 최댓값/최솟값, Y좌표별 X의 최댓값/최솟값을 저장할 Map
			HashMap<Integer, Integer> minX = new HashMap<>();
			HashMap<Integer, Integer> maxX = new HashMap<>();
			HashMap<Integer, Integer> minY = new HashMap<>();
			HashMap<Integer, Integer> maxY = new HashMap<>();
			
			for (int j = 0; j < N; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr[j][0] = x;
				arr[j][1] = y;
				
				// 같은 Y선상에서 가장 왼쪽(min), 오른쪽(max) X값 기록
				minX.put(y, Math.min(minX.getOrDefault(y, Integer.MAX_VALUE), x));
				maxX.put(y, Math.max(maxX.getOrDefault(y, Integer.MIN_VALUE), x));
				
				// 같은 X선상에서 가장 아래(min), 위(max) Y값 기록
				minY.put(x, Math.min(minY.getOrDefault(x, Integer.MAX_VALUE), y));
				maxY.put(x, Math.max(maxY.getOrDefault(x, Integer.MIN_VALUE), y));
			}
			
			long maxDoubleArea = 0; // 면적의 2배 값을 저장 (소수점 방지)
			
			for (int i = 0; i < N; i++) {
				int x = arr[i][0];
				int y = arr[i][1];
				
				// 현재 점을 직각으로 삼았을 때 만들 수 있는 가장 긴 가로/세로 길이
				long dx = Math.max(Math.abs(x - minX.get(y)), Math.abs(x - maxX.get(y)));
				long dy = Math.max(Math.abs(y - minY.get(x)), Math.abs(y - maxY.get(x)));
				
				maxDoubleArea = Math.max(maxDoubleArea, dx * dy);
			}
			
			// 문제에서 구하라는 것이 실제 넓이라면 / 2.0 을 해줘야 합니다.
            // (만약 소수점 처리에 대한 지시가 없다면 문제 조건을 다시 확인해보세요)
			System.out.println(maxDoubleArea); 
		}
	}
}