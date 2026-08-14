import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a==b && b==c) {
                System.out.println(a +" "+ a +" "+ a);
            } else if(a==b && b > c) {
                System.out.println(c +" "+ a +" "+ c);
            } else if(a==c && c > b) {
                System.out.println(a +" "+ b +" "+ b);
            } else if(b==c && c > a) {
                System.out.println(a +" "+ a +" "+ c);
            } else {
                System.out.println("-1 -1 -1");
            }
        }
    }
}