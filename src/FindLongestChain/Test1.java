package FindLongestChain;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
	
	public Test1(){}
	
	public int findLongestChain(int[][] pairs)
	{
		Arrays.sort(pairs, new Comparator<int[]>(){
			public int compare(int[] a, int[] b) {
				if(a[0] == b[0])	
					return a[1]-b[1];
				return a[0] - b[0];
				}
			});
		int ret = 1;
		int[] dp = new int[pairs.length];
		dp[0] = 1;
		for(int i=1; i<pairs.length; i++) {
			dp[i] = 1;
			for(int j=0; j<i; j++) {
				if(pairs[j][1] < pairs[i][0])
					dp[i] = Math.max(dp[i], dp[j]+1);
	        	}
	        	ret = Math.max(ret, dp[i]);
	        }
	        return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [][]={{1,2},{2,3},{3,4}};
		System.out.println((new Test1()).findLongestChain(a));
	}

}
